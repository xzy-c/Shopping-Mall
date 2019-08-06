package com.xzy.untils;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

public class AliyunMessageUntil {

    //产品名称:云通信短信API产品,开发者无需替换

    static final String product = "Dysmsapi";

//产品域名,开发者无需替换

    static final String domain = "dysmsapi.aliyuncs.com";

// TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)

    static final String accessKeyId = "LTAI7onhUvXMR74U";

    static final String accessKeySecret = "L8BI5sqhiTRmsHqbiUpzYe6sa8MHLz";


    public static String getCode(){
        return String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
    }
    public static String getCodeJSON(String i) {

        return "{\"code\":\"" +i + "\"}";
    }

    public static SendSmsResponse sendSms(String phone) throws ClientException {

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");//超时毫秒数
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-shanxi", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-shanxi", "cn-shanxi", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(phone);
        //必填:短信签名-可在短信控制台中找到
        request.setSignName("甜品小店");
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode("SMS_171352182");
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        String code = getCode();
        String codeJSON = getCodeJSON(code);
        request.setTemplateParam(codeJSON);

        //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
        //request.setSmsUpExtendCode("90997");

        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        request.setOutId("yourOutId");

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
        sendSmsResponse.setCode(code);

        return sendSmsResponse;
    }



}


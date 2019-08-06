package com.xzy.utils;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016100900648916";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC+xsanU8hjPHwVoNxVrimTFfEmBiylXdoqd5enzQBlRuytiKjBroluci5iDf6Y53LJyT0bOZIhUmok+iTK9b8EtNE7G+pqrFN0DCoe6Tp4WKKBUEnfk5gtN6GehD/hwbiVNze6OqmO8iz7e/YyhlppPTpzcQDF9/9W/4p8N7bkhqA63oAI+yDaCrW5t/Yn+6W3PtNgzRTdjO7UKwHHOglr5X+495dTJYgVU7+KOXZHb3jRa3wK4w1BseZve96AZ+5c+GIPgMh12UFZ88V/OAdgtYi70DBbKI7D7GiQLyfsUmyhFNNUpJH4F+C+IhqaHVTu4lss8ouXZwHBwWwXP69LAgMBAAECggEAOHeReRl9aJIQkD5KuTmRqK2H8R9Gu7OpzYQUaWBuS4vQphSbDqjgmMZHIFLQFuX6vetIoPRLYn2IWWWI2mIepf/3Ji2/Fs/m66RmGzwhSFnDz8657uk607dxqP+wANxcDB6J6h9O7LaVxeINHytRO3EaCe1asz4SX+fHT7kV81G6QldaHKDFICogsuA396bUQwoyeMRzRMtLEPm6U3kpt+vLpStWmvTS6Br/dvDNVml0Z9LooM+2/pUTRVhLX7bFErIHVl675pKnsSOLGzDrUSVbSooT0LzXQaC0T1JhMD6V3bRQLTe7kQUDhJHFMY7Su37e6VAHyAPQ18nyB6uhgQKBgQD0aZKfK6uMzNqU5qxiAVrnDnp0Ne47n1SqPOzmkvhc7RqQZAurhkAFHC7UQAozAP44+GciH+Fy70lX/VPsWhIKIlIHHz+en47sRYAr69OVjSbtRSJAZLr6c+2CW0OtO+1th3oMlg0VblIIFBl9fjADsNczsr8F/39BStQClSJnoQKBgQDH0jmvxWLFNktG2HhrG/Q7S7Gw3zz4h8zYIeHd5nqQh3ugDm9ynpTuXC1zP5+RTr8F698nzG/a579X6M4QL8GmV1N55NnnmJlhWyVjzO6WK7Spj0LS6v2Wcbp1jgS7ZmnuSG0QDFMdTAdMLAJqBKxbUiKPjF/nJZHaVhvQ5oX/awKBgAK3CYHrIkS2Idd1mISeLzxR1NplnvfalT4u3xLQnyGpIJpqAhctrphf78U70OEwKaLIX5zpbb+xGMd5cO03MuwZ5X9ewX4pl5TYUMwsGnWW08/e7Lp6Y/lUQFcqXF4YRFLrJlftcsfCKfcdAgt60123ISzZ13VhmTBIfIJq1a8BAoGBALfR9BF3sqobjVpqDzTxbVcTBi7g3pT/UHlPihn5Sa0lhZuzS+EUc4tnLsSDtgYVe/M1jn9tOUUWxlZXqyEG3c1pLjjHR5IfNpJyJ85Mmvt4z2Tgjqe7V3eLve0grce7qh1zcSk/PUKJS3lOTxY6oFgOEg8eIqdgT3Gcn1AokQJrAoGBAJgfCmVKd0jiOL7xTbLvBhRM+IEblTKIpEPEIHroOtS9Qd6MJOXZStSUOYbtk0iQCxl3esfbl+bJ2YrVsESIG3kOYKwGF8/MTaYIwRDbrPHuO+Rb7WN1AYvbRB0a1nzh0Q9jLHYYYaNqv3KrJQnihkzv3kTiMYh7zZ+WLmlAzIm2";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1FpApWHHFViMcH6q+bEw5XEjpMtE5CBgc7802Zq/8Yeb+2la4gIxwRLMX61hEiAlC7W0Y9F+n7rth8wle3SGreGWjs5n1kesZt96P+yJOzPrzljIKhiYEJy+hmdt9qrnc6N3qfazepIfLAU2LvZwg4TyutB7CTxvWYgX6ePUvAXBSePib/aMAmOPgkis9TpNw4nhl9Hn86kps9yQjklpqGCQmhouo9KCbv3HnoGm6MbL8J1lUvDV/IIE4yrmadn+WfDu2tnfY4d2539DWBVfgBuYfPpbMmPgOE2BrqwE15ypXn6PBcocjzo04xrKTYwz/ElLBhW757LaSg4fkfWc9wIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/order/alipayNotifyNotice.action";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/order/alipayReturnNotice.action";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


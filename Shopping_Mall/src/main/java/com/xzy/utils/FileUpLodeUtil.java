package com.xzy.utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

/**
 * @author yangxin
 * @date 2019/8/1 - 14:26
 */
public class FileUpLodeUtil {
    //accessKey
    private static String accessKey = "Cpaw3WsZlMptEw83PR-2ShHHQtLs8e7-FjUT22xn";//用钥匙刮屏幕得字符串
    //secretKey
    private static String secretKey ="bSnudjriyZ5gThpVZoNuB83yHIgX1URrU9VIsqYI";
    //储存空间名
    private static String bucket ="shopping_mall";
    //外链URL前缀
    private static String fronturl = "http://pvi0435pu.bkt.clouddn.com/";


    /**
     * 图片上传

     * @param file  图片路径
     * @return  链接
     * @throws QiniuException
     */
    public static  String  fileUpload(String file)throws QiniuException {
        Auth auth = Auth.create(accessKey,secretKey);
        String upToken = auth.uploadToken(bucket);  //上传凭证
        Configuration cfg = new Configuration(Zone.zone0());
        UploadManager uploadManager = new UploadManager(cfg);
        String key  = null;
        try {
            Response response = uploadManager.put(file, key, upToken);
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(),DefaultPutRet.class);
            return fronturl+putRet.key;
        }catch (QiniuException ex){
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                // ignore
            }
        }
        return null;
    }

    /**
     *删除图片
     * @param key
     * @return
     * @throws QiniuException
     */
    public static String delete(String key)throws QiniuException {
        Auth auth = Auth.create(accessKey,secretKey);
        Configuration cfg = new Configuration(Zone.zone0());
        BucketManager bucketMgr = new BucketManager(auth, cfg);
        try {
            bucketMgr.delete(bucket,key);
        }catch (QiniuException Q){
            return Q.toString();
        }
        System.out.println("success");
        return null;
    }
}

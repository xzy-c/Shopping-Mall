package com.xzy.service.base;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.xzy.pojo.User;
import org.springframework.http.server.ServerHttpResponse;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserService {
    public User loginCheck(User user);
    public void loginOut(User user);
    public void register(User user);
    public void updateuser_Password(String user_Tel);
    public SendSmsResponse sendMessage(String phone)throws Exception;

}

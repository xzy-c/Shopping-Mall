package com.xzy.service.imp;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.xzy.dao.UserMapper;
import com.xzy.pojo.User;
import com.xzy.service.base.UserService;
import com.xzy.untis.AliyunMessageUntil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceImp implements UserService
{

    @Autowired
    private UserMapper um;
    private AliyunMessageUntil aliyunMessageUntil;

    @Override
    public User loginCheck(User user) {
        User u = um.loginCheck(user);
        return u;

    }

    @Override
    public void loginOut(User user) {
        um.loginOut(user);
    }

    @Override
    public void register(User user) {

        um.register(user);
    }

    @Override
    public void updateuser_Password(String user_Tel) {
        um.updateuser_Password(user_Tel);
    }


    @Override
    public SendSmsResponse sendMessage(String phone) throws Exception {
        return aliyunMessageUntil.sendSms(phone);
    }
}

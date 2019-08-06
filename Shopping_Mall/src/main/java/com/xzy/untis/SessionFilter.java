package com.xzy.untis;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class SessionFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;// 涉及到HTTP请求处理，转型处理
        HttpServletResponse resp = (HttpServletResponse) response;

        String loginUser = (String) req.getSession().getAttribute("loginUser");// 判断用户是否完成了登录操作，session中是否存储用户名

        if (loginUser  ==null) {
            resp.sendRedirect(req.getContextPath() + "/index.jsp");// 未登录，系统强制重定向至登录页面
            return;
        } else {
            chain.doFilter(req, resp);
            return;
        }
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }
}


package com.myindex.controller;

import com.myindex.bean.RegisterUser;
import com.myindex.service.UserRepositoryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserRepositoryController {
    private static final String LOGIN_HTML ="admin_login.html" ;
    @Autowired
    private UserRepositoryservice userRepositoryservice;

    /**
     * 单独跳转注册界面
     * @return 注册界面
     */
    @PostMapping("/user/zhuce")
    public String userZhuCe(){

        return "register.html";
    }

    /**
     * 用户注册
     * @return 登录界面
     */


    @PostMapping("/user/register")
    public String userRegister(RegisterUser formUser, HttpServletRequest request){
//        request.setAttribute("user",formUser);
        request.setAttribute("msg", "注册成功！请登录：");




        return LOGIN_HTML;
    }


}

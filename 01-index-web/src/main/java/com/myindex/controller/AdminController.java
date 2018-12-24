package com.myindex.controller;

import com.myindex.bean.AdminUser;
import com.myindex.service.AdminUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Admin")
public class AdminController {

    private static final String LOGIN_HTML = "admin_login.html";
    private static final String SESSION_KEY = "username";
    @Resource
    private AdminUserservice adminUserservice;
//    @Autowired
//    private HttpSession session;

    @PostMapping("/login")
    public String adminLogin(AdminUser adminUser, HttpServletRequest request){

        request.setAttribute("user",adminUser);
        if (adminUser == null || adminUser.getUsername() == null || adminUser.getPassword() == null) {
            request.setAttribute("msg", "请正确填写用户信息!");
            return LOGIN_HTML;
        }
        AdminUser user = adminUserservice.findAdminUserByUsername(adminUser.getUsername());
        if (user == null || !(adminUser.getPassword().equals(user.getPassword()))){
            request.setAttribute("msg","登录信息有误!");
            return LOGIN_HTML;
        }


        request.setAttribute("msg", "登陆成功!");


        return LOGIN_HTML;


    }

}

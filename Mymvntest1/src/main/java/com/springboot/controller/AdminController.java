package com.springboot.controller;

import com.springboot.bean.Admin;
import com.springboot.service.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/Mytmvn")
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("/save")
    public void save(){
        Admin admin = new Admin();
        admin.setName("admin");
        admin.setPassword("123");
        adminService.save(admin);
    }

    @RequestMapping("/delete")
    public void delete(){
        adminService.delete(1);
    }

    @RequestMapping("/find")
    public Iterable<Admin> findall(){
       return adminService.getall();
    }

    @RequestMapping("/findbyid")
    public Admin findById(int id){
        return adminService.findById(id);
    }

    @RequestMapping("/findbyname")
    public Admin findMyname(String name){
        return adminService.findMyname(name);
    }
}

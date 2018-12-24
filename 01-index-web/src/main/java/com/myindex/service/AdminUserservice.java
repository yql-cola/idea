package com.myindex.service;

import com.myindex.bean.AdminUser;
import com.myindex.dao.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminUserservice {

    @Resource
    private AdminUserRepository adminUserRepository;

    public AdminUser findAdminUserByUsername(String username){
        if(username == null)
            return null;

        return adminUserRepository.findAdminUserByUsername(username);
    }


}

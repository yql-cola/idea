package com.springboot.service;

import com.springboot.bean.Admin;
import com.springboot.dao.AdminRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class AdminService {
    @Resource
    private AdminRepository adminRepository;


    //删除数据
    @Transactional
    public void delete(int id){
        adminRepository.deleteById(id);
    }

    //保存数据
    @Transactional
    public void save(Admin admin){
        adminRepository.save(admin);
    }
    //查询数据
    public Iterable<Admin> getall(){
        return adminRepository.findAll();
    }

    //查询数据
    public Admin findById(int id){
        return adminRepository.findById(id);
    }

    public Admin findMyname(String name){
        return adminRepository.findMyname(name);
    }

}

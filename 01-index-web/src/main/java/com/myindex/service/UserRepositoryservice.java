package com.myindex.service;

import com.myindex.bean.RegisterUser;
import com.myindex.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepositoryservice {
    @Autowired
    private UserRepository userRepository;


    public void userRegister(RegisterUser registerUser){
        userRepository.save(registerUser);
    }


    public List<RegisterUser> getUsers() {
        return userRepository.findAll();
    }

    public RegisterUser findRegisterUserByUsername(String username) {
        return userRepository.findRegisterUserByUsername(username);
    }

    public List<RegisterUser> checkUserIfExist(RegisterUser user) {
        return userRepository.findUserIfExist(user.getUsername(), user.getPhone(), user.getEmail());
    }

    public void updatePassword(String username, String password) {
        userRepository.updatePassword(username, password);
    }

    public void mockUsers(List<RegisterUser> users) {
        userRepository.saveAll(users);
    }

    public void updateProfile(RegisterUser user) {
        userRepository.updateProfile(user.getUsername(), user.getSex(), user.getAge(), user.getJob(), user.getPhone(), user.getEmail());
    }

    public void save(RegisterUser registerUser){
        userRepository.save(registerUser);
    }


}

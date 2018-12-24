package com.myindex.dao;

import com.myindex.bean.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<RegisterUser,Integer> {
    /**
     * 根据username查找用户
     *
     * @param username
     * @return RegisterUser
     */
    public RegisterUser findRegisterUserByUsername(String username);

    /**
     * 注册之前检查表中是否存在相同的username,phone,email 任何一项匹配则返回匹配的用户信息
     *
     * @param username
     * @param phone
     * @param email
     * @return  List<RegisterUser>
     */
    @Query("from RegisterUser where username=?1 or phone=?2 or email=?3")
    public List<RegisterUser> findUserIfExist(String username, String phone, String email);
    /**
     * 修改个人密码
     *
     * @param username
     * @param password
     * @return RegisterUser
     */

    @Transactional
    @Query("update RegisterUser set password=?2 where username=?1")
    @Modifying
    public void updatePassword(String username, String password);

    /**
     * 修改个人信息
     * @param username
     * @param sex
     * @param age
     * @param job
     * @param phone
     * @param email
     */
    @Transactional
    @Query("update RegisterUser set sex=?2,age=?3,job=?4,phone=?5,email=?6 where username=?1")
    @Modifying
    public void updateProfile(String username, String sex, String age, String job, String phone, String email);





}

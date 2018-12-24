package com.myindex.dao;

import com.myindex.bean.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminUserRepository extends JpaRepository<AdminUser,Integer> {

    @Query("from AdminUser where username=?1")
    public AdminUser findAdminUserByUsername(String username);



}

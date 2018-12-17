package com.springboot.dao;

import com.springboot.bean.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin,Integer> {

    public Admin findById(int id);

    @Query("from Admin where name=?2")
    public Admin findMyname(String name);

}

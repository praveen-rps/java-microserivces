package com.example.mappings.one2onedemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mappings.one2onedemo.model.Tuser;


@Repository
public interface TUserDao extends JpaRepository<Tuser,Long>{

}

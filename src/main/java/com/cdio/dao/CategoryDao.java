package com.cdio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdio.entity.Account;
import com.cdio.entity.Authority;
import com.cdio.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

}

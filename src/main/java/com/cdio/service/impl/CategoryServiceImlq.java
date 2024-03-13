package com.cdio.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.cdio.dao.CategoryDao;
import com.cdio.entity.Category;

import com.cdio.service.CategoryService;



@Service
public class CategoryServiceImlq implements CategoryService {
	@Autowired
	CategoryDao cdao;

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return cdao.findAll();
	}

	@Override
	public Category findById(Integer category_id) {
		// TODO Auto-generated method stub
		return cdao.findById(category_id).get();
	}

	@Override
	public Category create(Category category) {
		// TODO Auto-generated method stub
		return cdao.save(category);
	}

	@Override
	public Category update(Category category) {
		// TODO Auto-generated method stub
		return cdao.save(category);
	}

	@Override
	public void delete(Integer category_id) {
		// TODO Auto-generated method stub
		cdao.deleteById(category_id);
	}
	
	

	
}

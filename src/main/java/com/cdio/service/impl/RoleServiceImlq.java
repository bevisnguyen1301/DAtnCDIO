package com.cdio.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cdio.dao.AccountDao;
import com.cdio.dao.AuthorityDao;
import com.cdio.dao.RoleDao;
import com.cdio.entity.Role;
import com.cdio.service.AccountService;
import com.cdio.service.AuthorityService;
import com.cdio.service.RoleService;



@Service
public class RoleServiceImlq implements RoleService {
	@Autowired
	private RoleDao rdao;

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return rdao.findAll();
	}

	

	
}

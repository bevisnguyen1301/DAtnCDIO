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
import com.cdio.dao.OrderDetailDao;
import com.cdio.entity.OrderDetail;
import com.cdio.service.AccountService;
import com.cdio.service.AuthorityService;
import com.cdio.service.OrderDetailService;



@Service
public class OrderDetailServiceImlq implements OrderDetailService {
	@Autowired
	 OrderDetailDao dao;

	@Override
	public List<OrderDetail> findByOrderID(Integer orderid) {
		return dao.findByOrderID(orderid);
	}

	

	

	
}

package com.cdio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdio.dao.CategoryDao;
import com.cdio.dao.TrademarkDao;
import com.cdio.entity.Category;
import com.cdio.entity.Trademark;
import com.cdio.service.TrademarkService;

@Service
public class TrademarkServiceImql implements TrademarkService{
	@Autowired
	TrademarkDao tdao;

	@Override
	public List<Trademark> findAll() {
		// TODO Auto-generated method stub
		return tdao.findAll();
	}

	@Override
	public Trademark findById(Integer trademark_id) {
		// TODO Auto-generated method stub
		return tdao.findById(trademark_id).get();
	}

	@Override
	public Trademark create(Trademark trademark_id) {
		// TODO Auto-generated method stub
		return tdao.save(trademark_id);
	}

	@Override
	public Trademark update(Trademark trademark_id) {
		// TODO Auto-generated method stub
		return tdao.save(trademark_id);
	}

	@Override
	public void delete(Integer trademark_id) {
		// TODO Auto-generated method stub
		tdao.deleteById(trademark_id);
	}
	

}

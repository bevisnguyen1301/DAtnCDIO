package com.cdio.service;

import java.util.List;

import com.cdio.entity.Category;
import com.cdio.entity.Trademark;

public interface TrademarkService {

	List<Trademark> findAll();

	Trademark findById(Integer trademark_id);

	Trademark create(Trademark trademark_id);

	Trademark update(Trademark trademark_id);

	void delete(Integer trademark_id);

}

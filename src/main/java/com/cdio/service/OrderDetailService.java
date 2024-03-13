package com.cdio.service;

import java.util.List;

import com.cdio.entity.OrderDetail;

public interface OrderDetailService {

	List<OrderDetail> findByOrderID(Integer orderid);

}

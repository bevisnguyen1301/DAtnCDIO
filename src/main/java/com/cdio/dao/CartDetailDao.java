package com.cdio.dao;

import com.cdio.entity.CartDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartDetailDao extends CrudRepository<CartDetail, Integer> {
    void deleteAllByCart_Id(Integer id);
    List<CartDetail> getAllByCart_Id(Integer id);
}

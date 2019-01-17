package com.yg.dao;

import java.util.List;

import com.yg.entity.YgProduct;

public interface YgProductDao {
	YgProduct findPageObjects (Integer id);
	List<YgProduct> selectAll ();
}

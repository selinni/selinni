package com.yg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yg.dao.YgProductDao;
import com.yg.entity.YgProduct;
import com.yg.service.YgProductService;
@Service
public class YgProductServiceImpl implements YgProductService{
 
	@Autowired 
	private YgProductDao ygProductDao;
	@Override
	public YgProduct findPageObjects(Integer id) {
		
		return ygProductDao.findPageObjects(id);
	}
	@Override
	public List<YgProduct> selectAll() {
		
		return ygProductDao.selectAll();
	}

}

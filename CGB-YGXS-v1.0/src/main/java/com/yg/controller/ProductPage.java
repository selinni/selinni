package com.yg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yg.common.vo.JsonResult;
import com.yg.entity.YgProduct;
import com.yg.service.YgProductService;

@Controller
@RequestMapping("/products/")
public class ProductPage {
	@Autowired 
	private YgProductService ygProductService;
	
	
	@RequestMapping("getBeef")
	public String getBeef(){
		return "0510_niupai";
	}
	@RequestMapping("getSheep")
	public String getSheep(){
		return "0514_yangrou";
	}
	@RequestMapping("getPeigen")
	public String getPeigen(){
		return "0515_peigen";
	}
	
	@RequestMapping("getOneJason")
	@ResponseBody
	public JsonResult getOneJason(Integer id){
		YgProduct product = ygProductService.findPageObjects(id);
		return new JsonResult(product);
	}
	@RequestMapping("getAllJason")
	@ResponseBody
	public JsonResult getAllJason(Integer id){
		List<YgProduct> product = ygProductService.selectAll();
		return new JsonResult(product);
	}
}

package com.yg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products/")
public class ProductPage {
	@RequestMapping("getBeef")
	public String getBeef(){
		return "0510_niupai";
	}
}

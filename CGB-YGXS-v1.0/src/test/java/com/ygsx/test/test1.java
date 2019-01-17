package com.ygsx.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
	protected ClassPathXmlApplicationContext ctx;
	@Before
	public void init() {
		ctx=new ClassPathXmlApplicationContext("spring-configs.xml");
	}
	@After
	public void destory() {
		ctx.close();
	}
}
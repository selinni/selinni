package com.yg.common.vo;

import java.io.Serializable;

public class JsonResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int state=1;
	/**响应信息*/
	private String message;
	/**响应对象数据*/
	private Object data;
	
	
	public JsonResult() {
		super();
	}
	
	
	public JsonResult(int state) {
		super();
		this.state = state;
	}


	public JsonResult(Object data) {
		super();
		this.data = data;
	}

	public JsonResult(Throwable e) {
		
		this.message = e.getMessage();
		
	}
	public JsonResult(String message) {
		
		this.message = message;
		
	}
	
	public JsonResult(int state, String message, Object data) {
		super();
		this.state = state;
		this.message = message;
		this.data = data;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

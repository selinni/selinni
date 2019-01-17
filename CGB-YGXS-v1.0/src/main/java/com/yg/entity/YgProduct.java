package com.yg.entity;

import java.io.Serializable;

public class YgProduct implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3999345489334571262L;
	private Integer id;
	private Byte soldOut;
	private String category;
	private Integer categoryId;
	private String name;
	private Double price;
	private String imgUrl;
	private String productUrl;
	private String spec;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Byte getSoldOut() {
		return soldOut;
	}
	public void setSoldOut(Byte soldOut) {
		this.soldOut = soldOut;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getProductUrl() {
		return productUrl;
	}
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "YgProduct [id=" + id + ", soldOut=" + soldOut + ", category=" + category + ", categoryId=" + categoryId
				+ ", name=" + name + ", price=" + price + ", imgUrl=" + imgUrl + ", productUrl=" + productUrl
				+ ", spec=" + spec + "]";
	}
	
	
}

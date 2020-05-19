package io.object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{ //직렬화 가능한 객체라고 알려줌

	/**
	 * 
	 */
	private static final long serialVersionUID = 6167354408579785314L; //직렬화 아이디를 JVM에서 알아서 
	private String maker;
	private int price;
	
	public Phone() {
		
	}

	public Phone(String maker, int price) {
		this.maker = maker;
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [maker=" + maker + ", price=" + price + "]";
	}
	
}

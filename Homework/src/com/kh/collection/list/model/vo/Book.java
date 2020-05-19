package com.kh.collection.list.model.vo;

public class Book {

	private int bNo;
	private int category;
	private String title;
	private String auther;
	
	public Book() {
		
	}

	public Book(int category, String title, String auther) {
		this.category = category;
		this.title = title;
		this.auther = auther;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	@Override
	public String toString() {
		return "Book [bNo=" + bNo + ", category=" + category + ", title=" + title + ", auther=" + auther + "]";
	}
	
	
}

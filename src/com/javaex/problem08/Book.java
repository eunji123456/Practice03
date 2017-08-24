package com.javaex.problem08;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	private String Code;
	//기본 생성자.
	public Book(int bookNo, String title, String author) {
		this.bookNo= bookNo;
		this.title=title;
		this.author=author;
		stateCode=1;
		Code="재고 있음";
		
	}
	public int bookNo() {
		return bookNo;
	}
	public String title() {
		return title;
	}
	public String author() {
		return author;
	}
	//빌릴때 호출되는 메소드 
    public void rent(){
    		stateCode=0;
    		System.out.println(title+"이(가) 대여 됬습니다.");
    	
    }
    public void print() {
    	
    }
    
    
    
}

package com.javaex.problem01;

public class Member {
	private int id ;
	private String name ;
	private int point ; 

	public void setname(String name) {
		this.name=name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public void setpoint(int point) {
		this.point=point;
	}
	
	public String getname(){
		 return name;
	}
	public int getid() {
		return id;
	}
	public int getpoint() {
		return point;
	}
}

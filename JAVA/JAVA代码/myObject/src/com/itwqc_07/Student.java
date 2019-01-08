package com.itwqc_07;
/*
 * 局部变量会隐藏成员变量
 * this 可以解决
 * 
 */
public class Student {

	private String name;
	private int age;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}

package com.itstar.wqc01;

public abstract class Person {
	
	//成员变量
	private String name;
	//构造函数
	public Person(){
		
	}
	//声明一个抽象方法
	public abstract void eat();
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

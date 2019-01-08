package com.itster.demo01;
/**
 * 打印机的抽象类
 * @author WQC
 *	抽象类中不一定含有抽象方法
 */

public abstract class Printer {
	//成员变量 属性
	private String name;
	private String type;
	
	public Printer(){
		
	}
	//声明一个抽象方法--打印
	public abstract void print();//{
	
	public abstract void check();
	//抽象方法不能有方法体}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

package com.itstar.jiudian;
/**
 * 顾客类--来饭店吃饭
 * @author WQC
 *
 */
public class Customer {

	private String name;//顾客的名字
	private String phoneNum;//顾客的手机号
	private String type;//顾客的类型
	
	public Customer(){
		
		super();
	}
	
	public Customer(String name,String phoneNum,String type){
		
		this.name=name;
		this.phoneNum=phoneNum;
		this.type=type;
		
	}
	
	public void show(){
		
		System.out.println("服务员"+name+"来，点菜");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}

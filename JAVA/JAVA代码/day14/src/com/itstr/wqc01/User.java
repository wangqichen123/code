package com.itstr.wqc01;

public class User extends Person{
	
	public String getName(){
		
		return name;
	}
	
	public char getSex(){
		
		return sex;
	}
	//private 无法直接访问
//	public int getAge(){
//		return age;
//	}
	public String getAddress(){
		return address;
	}
	
}

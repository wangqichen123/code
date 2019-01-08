package com.itstar.demo01;
/*
 * 定义一个人类
 */
public class Perspn {
  
	//姓名
	public String name;
	//性别
	char sex;
	//年龄
	int age;
	
	/*成员方法*/
	public void eat(){
		System.out.println(name+"在吃饭");
	}
	 public void drink(){
		 System.out.println(name+"在喝饮料");
	 }
	public void buy(Drinks drink){
		System.out.println(name+"买了一瓶"+drink.name+"花了"+drink.price);
	}
}

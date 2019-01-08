package com.itwqc_08;
/*
 * 构造方法:
 * 		给对象的数据进行初始化
 * 
 * 格式:
 * 		方法名和类名相同
 * 		没有返回值类型，连void都不能写
 * 		没有具体的返回值
 */
public class Student {
	//public Student(){
		//System.out.println("这是构造方法");
	//}
	private String name;
	private int age;
	public Student(){
		
	}
	public Student(String name){
		this.name =name;
	}
	public Student(String name,int age){
		this.name=name;
		this.age=age; 
	}
	public void show(){
		System.out.println(name+"---"+age);
		
	}
	
}

package com.itwqc_02;
/*
 * Student是一个学生事物描述类，main 方法不适合放在它里面
 * 
 * 使用一个类，其实就是使用该类的成员（成员变量和成员方法）
 * 想要使用一个类的成员，就必须首先拥有该类的对象
 * 我们如何创建一个对象
 * 
 * 格式：类名 对象名=new 类名（）；
 * 
 * 对象如何访问成员呢？
 * 		成员变量：对象名。变量名
 * 		成员方法：对象名。方法名（参数）
 */
public class StudentDemo {
	public static void main(String[] args){
		//格式：类名 对象名=new 类名();
		Student s=new Student();
		//System.out.println("s:"+s);
		System.out.println("姓名："+s.name);
		System.out.println("年龄："+s.age);
		System.out.println("-----------");
		s.name="wqc";
		s.age=22;
		//赋值后再次输出
		System.out.println("姓名："+s.name);
		System.out.println("年龄："+s.age);
		
		
		//调用成员方法
		s.study();
		s.eat();
	}
}

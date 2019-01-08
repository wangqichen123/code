package com.itwqc_02;
/*
 * 类的定义：
 * 类是用啦描述现实世界的事物的
 * 
 * 事物:
 * 		属性：事物的概述信息
 * 		行为：事物能够做什么
 * 
 * 类是如何和事物进行对应的呢？
 * 		类：
 * 			成员变量
 * 			成员方法
 * 
 * 需求：写一个学术类
 * 
 * 学生事物：
 * 		属性：姓名，年龄。。。
 * 		行为：学习，吃饭。。。
 * 
 * 学生类：
 * 		成员变量：姓名，年龄
 * 		成员方法：学习，吃饭
 * 成员变量：和我们前面学习的变量定义一样
 *  		位置不同：类中，方法外
 *  		初始化值：不需要给初始化值
 *  成员方法：和我们前面学习过的定义是一样的
 *  		去掉static关键字
 *  
 */

public class Student {
  //成员变量
	//姓名
	String name;
	//年龄
	int age;
	//成员方法
	//学习方法
	public void study(){
		System.out.println("好好学习，天天向上");
		
	}
	//吃饭的方法
	public void eat(){
		System.out.println("学习饿了要吃饭");
	}
}

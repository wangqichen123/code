package com.itser.wqc03;
/**
 * 多态--人类 实现动物的喂食
 * @author WQC
 *
 */
public class Person {
	
	private String name;
	public int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	//喂食方法--万能喂食方法  在运行过程中，决定喂食方法
	public void feed(Animal animal,Food food){
		animal.eat();
		food.showName();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

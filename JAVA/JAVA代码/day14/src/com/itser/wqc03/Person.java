package com.itser.wqc03;
/**
 * ��̬--���� ʵ�ֶ����ιʳ
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
	//ιʳ����--����ιʳ����  �����й����У�����ιʳ����
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

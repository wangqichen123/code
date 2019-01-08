package com.itser.wqc03;
/**
 * 动物类 作为父类
 * @author WQC
 *
 */
public class Animal {
	private int age;
	private double weight;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat(){
		System.out.println("动物在吃东西");
	}
	public void cry(){
		System.out.println("动物再叫");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}

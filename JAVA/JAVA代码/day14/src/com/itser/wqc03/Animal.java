package com.itser.wqc03;
/**
 * ������ ��Ϊ����
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
		System.out.println("�����ڳԶ���");
	}
	public void cry(){
		System.out.println("�����ٽ�");
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

package com.itstr.wqc01;
/**
 * 演示访问控制修饰符
 * @author WQC
 *
 */
public class Person {
	//针对不同权限的修饰符 声明四个成员变量
	public String name;
	protected char sex;
	private int age;
	String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

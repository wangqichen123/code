package com.itstr.wqc01;
/**
 * ��ʾ���ʿ������η�
 * @author WQC
 *
 */
public class Person {
	//��Բ�ͬȨ�޵����η� �����ĸ���Ա����
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

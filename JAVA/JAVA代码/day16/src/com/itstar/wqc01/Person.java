package com.itstar.wqc01;

public abstract class Person {
	
	//��Ա����
	private String name;
	//���캯��
	public Person(){
		
	}
	//����һ�����󷽷�
	public abstract void eat();
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

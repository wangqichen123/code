package com.array.wqc01;
/**
 * ��ʾarrayListʹ��
 * @author WQC
 *
 */
public class Person {
	
	private String name;
	private int age;
	
	public Person(){
		
	}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	//��д object toString ����
	public String toString(){
		
		return "["+this.name+","+this.age+"]";
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

package com.array.wqc01;
/**
 * 演示arrayList使用
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
	//重写 object toString 方法
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

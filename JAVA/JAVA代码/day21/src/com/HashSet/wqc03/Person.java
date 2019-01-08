package com.HashSet.wqc03;

import java.util.Comparator;

public class Person implements Comparator<Person>{
    private String name;
    private int age;
    
    public Person(){
    	
    }
    public Person(String name,int age){
    	this.name=name;
    	this.age=age;
    }
	/**
	 * 根据年龄大小进行排序
	 */
	
	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		if(p1.age>p2.age){
			return 1;
		}else if(p1.age<p2.age){
			return -1;
		}else{
		return 0;
	}
	}	
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
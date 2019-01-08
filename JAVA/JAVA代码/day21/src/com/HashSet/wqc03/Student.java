package com.HashSet.wqc03;

public class Student {
	private String id;
	private String name;
	private char sex;
	
	
	public Student(){
		
	}
	public Student(String id,String name,char sex){
		this.id=id;
		this.name=name;
		this.sex=sex;
	}
	//重写hashcode 方法
	public int hashCode(){
		
		return id.hashCode();
	}
	public boolean equals(Object obj){
		
		if(this==obj)return true;
		if(obj instanceof Student){
			//向下转型
			Student stu=(Student) obj;
			if(stu.name==this.name &&stu.id==this.id&&stu.sex==this.sex){
				
				return true;
			}
			
		}
		return false;
		
	}
	
	//toString 重写
	public String toString(){
		return "["+this.id+","+this.name+","+this.sex+"]";
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	
}

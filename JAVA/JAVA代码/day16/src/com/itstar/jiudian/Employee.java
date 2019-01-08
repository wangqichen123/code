package com.itstar.jiudian;
/**
 * 饭店的员工类
 * @author WQC
 * 员工：姓名    年龄   员工号   
 */
public class Employee {

	private String name;
	private int age;
	private String id;
	private double salary;
	
	public Employee(){
			
	}
	
	public Employee(String name,int age,String id){
		this.name=name;
		this.age=age;
		this.id=id;
		//System.out.println("");
	}
	
	public void work(){
		
		System.out.println("员工正在工作");
		
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

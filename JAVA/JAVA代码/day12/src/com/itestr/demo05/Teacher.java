package com.itestr.demo05;
// 老师类
/**
 * toString 的重写
 * @author WQC
 *
 */
public class Teacher {
	private int workYear ;
	private String name;
	
	//构造函数
	public Teacher(String name,int workYear){
		this.name=name;
		this.workYear=workYear;
	}
	public String toString(){
		System.out.println("重写之前的toString");
		super.toString();
		return "["+this.name+","+this.workYear+"]";
	}
	
}

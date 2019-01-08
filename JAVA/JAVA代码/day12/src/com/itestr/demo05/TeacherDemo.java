package com.itestr.demo05;

public class TeacherDemo {
	public static void main(String[] args) {
		
		Teacher tc=new Teacher("wqc",3);
		Teacher teac=new Teacher("wqc",3);
		//自带的equal 的方法 比较的是地址 
		//每个对象都有独立的存储空间
		System.out.println(tc.equals(teac));
		
	}
}

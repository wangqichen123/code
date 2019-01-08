package com.itwqc_05;
/*
 * 学生测试类
 * 
 * 
 */
public class StudentDemo {
	public static void main(String[] args){
		//创建学生对象
		Student w=new Student();
		w.show();
		
		w.name="wqc";
		w.setAge(99);
		w.show();
	}
}

package com.itwqc_07;
/*
 * 学生类的测试类
 * 
 */
public class StudentDemo {
	public static void main(String[] args){
		//创建对象
		Student s=new Student();
		System.out.println(s.getName()+"---"+s.getAge());
		
		s.setName("wqc");
		s.setAge(22);
		System.out.println(s.getName()+"---"+s.getAge());
	}
}

package com.itwqc_09;
/*
 * ≤‚ ‘¿‡
 */
public class StudentDemo {
	public static void main(String[] args){
		Student s=new Student();
		s.setName("wqc");
		s.setAge(28);
		System.out.println(s.getName()+"---"+s.getAge());
		Student s2=new Student("wqc",22);
		System.out.println(s2.getName()+"---"+s2.getAge());
		
		
	}
}

package com.itwqc_07;
/*
 * ѧ����Ĳ�����
 * 
 */
public class StudentDemo {
	public static void main(String[] args){
		//��������
		Student s=new Student();
		System.out.println(s.getName()+"---"+s.getAge());
		
		s.setName("wqc");
		s.setAge(22);
		System.out.println(s.getName()+"---"+s.getAge());
	}
}

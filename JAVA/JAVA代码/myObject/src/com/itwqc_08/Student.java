package com.itwqc_08;
/*
 * ���췽��:
 * 		����������ݽ��г�ʼ��
 * 
 * ��ʽ:
 * 		��������������ͬ
 * 		û�з���ֵ���ͣ���void������д
 * 		û�о���ķ���ֵ
 */
public class Student {
	//public Student(){
		//System.out.println("���ǹ��췽��");
	//}
	private String name;
	private int age;
	public Student(){
		
	}
	public Student(String name){
		this.name =name;
	}
	public Student(String name,int age){
		this.name=name;
		this.age=age; 
	}
	public void show(){
		System.out.println(name+"---"+age);
		
	}
	
}

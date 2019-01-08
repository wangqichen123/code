package com.HashSet.wqc03;

import java.util.HashSet;

public class HashSetTest02 {
	public static void main(String[] args) {
		//1 初始化
		
		HashSet<Student> hs=new HashSet<Student>();
		//2 学生类初始化
		
		Student s1=new Student("001","张三",'男');
		Student s2=new Student("002","张四",'男');
		Student s3=new Student("003","张五",'男');
		
		//3 增加内容
		
		System.out.println(hs.add(s1));
		System.out.println(hs.add(s2));
		System.out.println(hs.add(s3));
		
		
		for(Student stu:hs){
			System.out.println(stu.hashCode());
		}
		
		
	}
}

package com.HashSet.wqc03;

import java.util.HashSet;

public class HashSetTest02 {
	public static void main(String[] args) {
		//1 ��ʼ��
		
		HashSet<Student> hs=new HashSet<Student>();
		//2 ѧ�����ʼ��
		
		Student s1=new Student("001","����",'��');
		Student s2=new Student("002","����",'��');
		Student s3=new Student("003","����",'��');
		
		//3 ��������
		
		System.out.println(hs.add(s1));
		System.out.println(hs.add(s2));
		System.out.println(hs.add(s3));
		
		
		for(Student stu:hs){
			System.out.println(stu.hashCode());
		}
		
		
	}
}

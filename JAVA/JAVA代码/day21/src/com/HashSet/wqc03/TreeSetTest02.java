package com.HashSet.wqc03;

import java.util.TreeSet;

public class TreeSetTest02 {
	public static void main(String[] args) {
		
		//1 ��ʼ��  treeset
		
		TreeSet<Person> ts=new TreeSet<Person>();
		//2 add �������������  Person ��ʼ��
		Person p1=new Person("wqc",22);
		Person p2=new Person("cwq",23);
		Person p3=new Person("qwc",24);
		
		//3 ���Ӷ���
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		
		//��Ȼ˳���������
		System.out.println(ts);
		
		
		
	}
}

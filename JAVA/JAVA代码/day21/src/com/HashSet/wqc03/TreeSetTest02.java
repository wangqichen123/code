package com.HashSet.wqc03;

import java.util.TreeSet;

public class TreeSetTest02 {
	public static void main(String[] args) {
		
		//1 初始化  treeset
		
		TreeSet<Person> ts=new TreeSet<Person>();
		//2 add 方法随意放数据  Person 初始化
		Person p1=new Person("wqc",22);
		Person p2=new Person("cwq",23);
		Person p3=new Person("qwc",24);
		
		//3 增加对象
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		
		//自然顺序进行排序
		System.out.println(ts);
		
		
		
	}
}

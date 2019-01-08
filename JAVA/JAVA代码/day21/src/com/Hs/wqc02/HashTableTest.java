package com.Hs.wqc02;

import java.util.Enumeration;
import java.util.Hashtable;

import com.HashSet.wqc03.Student;

public class HashTableTest {
	public static void main(String[] args) {
		
		//1 初始化
		Hashtable<String,Student> hashtable=new Hashtable<String,Student>();
		
		
		Student s1=new Student("001","张三",'男');
		Student s2=new Student("002","张四",'男');
		Student s3=new Student("003","张五",'男');
		
		//3 put key 可以自己定义 也可以使用既有的  要有规范 便于计算  wordCount
		//不能重复
		//不允许 null 值
		hashtable.put("001", s1);
		hashtable.put("002", s2);
		hashtable.put(s3.getId(), s3);
		
		//Hashtable 循环  特有循环 Enumeration<v> elements()
		Enumeration<String> enu=hashtable.keys();
		while(enu.hasMoreElements()){
			String key=enu.nextElement();
			System.out.println(key+":"+hashtable.get(key));
			
		}
		
			
	}
}

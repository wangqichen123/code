package com.Hs.wqc02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.HashSet.wqc03.Student;

public class HashMapTest {
	public static void main(String[] args) {
		
		//1 初始化HashMap
		HashMap<String,Student> hashmap=new HashMap<String,Student>();
		
		
		//2 初始化学生对象
		Student s1=new Student("001","张三",'男');
		Student s2=new Student("002","张四",'男');
		Student s3=new Student("003","张五",'男');
		
		//3 put key 可以自己定义 也可以使用既有的  要有规范 便于计算  wordCount
		//不能重复
		hashmap.put("001", s1);
		hashmap.put("002", s2);
		hashmap.put(s3.getId(), s3);
		
		//允许null 值
		
		hashmap.put(null, null);
		
		//循环  HashMap
		//4-1  Keyset
		Set<String> keyset=hashmap.keySet();
		Iterator<String> it=keyset.iterator();
		while(it.hasNext()){
			String key=it.next();
			System.out.println(key+":"+hashmap.get(key));
		}
		//4-2  entrySet Collettion
		Iterator it2=hashmap.entrySet().iterator();
		while(it2.hasNext()){
			Map.Entry<String,Student> entry=(Map.Entry<String, Student>)it2.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
	}
}

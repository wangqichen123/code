package com.Hs.wqc02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.HashSet.wqc03.Student;

public class HashMapTest {
	public static void main(String[] args) {
		
		//1 ��ʼ��HashMap
		HashMap<String,Student> hashmap=new HashMap<String,Student>();
		
		
		//2 ��ʼ��ѧ������
		Student s1=new Student("001","����",'��');
		Student s2=new Student("002","����",'��');
		Student s3=new Student("003","����",'��');
		
		//3 put key �����Լ����� Ҳ����ʹ�ü��е�  Ҫ�й淶 ���ڼ���  wordCount
		//�����ظ�
		hashmap.put("001", s1);
		hashmap.put("002", s2);
		hashmap.put(s3.getId(), s3);
		
		//����null ֵ
		
		hashmap.put(null, null);
		
		//ѭ��  HashMap
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

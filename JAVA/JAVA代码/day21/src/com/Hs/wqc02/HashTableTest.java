package com.Hs.wqc02;

import java.util.Enumeration;
import java.util.Hashtable;

import com.HashSet.wqc03.Student;

public class HashTableTest {
	public static void main(String[] args) {
		
		//1 ��ʼ��
		Hashtable<String,Student> hashtable=new Hashtable<String,Student>();
		
		
		Student s1=new Student("001","����",'��');
		Student s2=new Student("002","����",'��');
		Student s3=new Student("003","����",'��');
		
		//3 put key �����Լ����� Ҳ����ʹ�ü��е�  Ҫ�й淶 ���ڼ���  wordCount
		//�����ظ�
		//������ null ֵ
		hashtable.put("001", s1);
		hashtable.put("002", s2);
		hashtable.put(s3.getId(), s3);
		
		//Hashtable ѭ��  ����ѭ�� Enumeration<v> elements()
		Enumeration<String> enu=hashtable.keys();
		while(enu.hasMoreElements()){
			String key=enu.nextElement();
			System.out.println(key+":"+hashtable.get(key));
			
		}
		
			
	}
}

package com.array.wqc01;

import java.util.ArrayList;

public class ArrayListTest02 {
	
	public static void main(String[] args) {
		
		//1 ��ʼ��
		ArrayList<String> array=new ArrayList<String>();
		array.add("wqc");
		array.add("666");
		array.add(0, "cqw");
//		array.add(true);
//		array.add(1.5);
		ArrayList<String> array2=new ArrayList<String>();
		array2.addAll(array);
//		array2.clear();//��Ԫ����� -->����
//		array2.remove(0);//�ѵ�0��λ�õ�ֵɾ��
		
		array2.set(0, "wwqqcc");
		
		System.out.println(array2.contains("wc"));//�鿴�Ƿ����ĳ��Ԫ��
		
		System.out.println(array2);
		System.out.println(array.size());
		
		for(int i=0;i<array.size();i++){
			
			System.out.println(array.get(i).getClass());
		}
		//arrayList �Զ�����������Person
			ArrayList<Person> parray=new ArrayList<Person>();
			Person p1=new Person("wqc",22);
			Person p2=new Person("cqw",23);
			
			parray.add(p1);
			parray.add(p2);
			for(int i=0;i<parray.size();i++){
				System.out.println(parray.get(i).getClass()+":"+parray.get(i));
			}
			//����һ��person ����
			Person[] per=new Person[2];
			
			//arrayList ���������ת��
			parray.toArray(per);
			
			System.out.println(per[0]);
			System.out.println(per[1]);
			
	}
}
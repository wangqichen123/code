package com.array.wqc01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist=new ArrayList<Integer>();
		for(int i=0;i<3;i++){
			
			alist.add(i);
		}
		//����1 ͨ��size
		System.out.println("����1 ͨ��size");
		for(int i=0;i<alist.size();i++){
			System.out.println(alist.get(i));
		}
		//����2 ͨ�������� Iterator
		System.out.println("����2 ͨ�������� Iterator");
	Iterator<Integer> iter=alist.iterator();
	
	while(iter.hasNext()){
		System.out.println(iter.next());
	}
	//����3  ��ǿfor ѭ�� ���alist�е�ÿһ������ ��ֵ��integer
	System.out.println("����3  ��ǿfor ѭ�� ���alist�е�ÿһ������ ��ֵ��integer");
	for(Integer integer:alist)
	{
		System.out.println(integer);
	}
	
	//����4 --jdk1.8������ foreach
	System.out.println("����4 --jdk1.8������ foreach");
	 alist.forEach(integer->{System.out.println(integer);});	
	
	
	}

}

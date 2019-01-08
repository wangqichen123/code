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
		//方法1 通过size
		System.out.println("方法1 通过size");
		for(int i=0;i<alist.size();i++){
			System.out.println(alist.get(i));
		}
		//方法2 通过迭代器 Iterator
		System.out.println("方法2 通过迭代器 Iterator");
	Iterator<Integer> iter=alist.iterator();
	
	while(iter.hasNext()){
		System.out.println(iter.next());
	}
	//方法3  增强for 循环 针对alist中的每一个对象 赋值给integer
	System.out.println("方法3  增强for 循环 针对alist中的每一个对象 赋值给integer");
	for(Integer integer:alist)
	{
		System.out.println(integer);
	}
	
	//方法4 --jdk1.8新特性 foreach
	System.out.println("方法4 --jdk1.8新特性 foreach");
	 alist.forEach(integer->{System.out.println(integer);});	
	
	
	}

}

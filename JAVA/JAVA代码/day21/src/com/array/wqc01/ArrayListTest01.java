package com.array.wqc01;

import java.util.ArrayList;

public class ArrayListTest01 {
	
	public static void main(String[] args) {
		
		//1 ³õÊ¼»¯
		ArrayList array=new ArrayList();
		array.add("wqc");
		array.add("666");
		array.add(true);
		array.add(1.5);
		System.out.println(array);
		System.out.println(array.size());
		
		for(int i=0;i<array.size();i++){
			
			System.out.println(array.get(i).getClass());
		}
		int[] arry=new int[3];
		arry[0]=1;
		
	}
}

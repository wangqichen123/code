package com.HashSet.wqc03;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		//1 初始化  treeset
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		//2 add 方法随意放数据
		ts.add(6);
		ts.add(8);
		ts.add(3);
		ts.add(1);
		ts.add(2);
		ts.add(5);
		
		//自然顺序进行排序
		System.out.println(ts);
		
		
		
	}
}

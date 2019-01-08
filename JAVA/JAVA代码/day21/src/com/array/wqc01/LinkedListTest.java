package com.array.wqc01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> linkedlist=new LinkedList<String>();
		
		linkedlist.add("a");
		linkedlist.add("b");
		linkedlist.add("c");
		
		linkedlist.addFirst("1");//链表头添加元素
		System.out.println(linkedlist);
		
		linkedlist.addLast("d");//链表尾添加元素
		System.out.println(linkedlist);
		//检查列表的第一个元素
		System.out.println(linkedlist.peekFirst());
		System.out.println(linkedlist);
		linkedlist.pop();
		System.out.println(linkedlist);
		
		Iterator iterator=linkedlist.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}

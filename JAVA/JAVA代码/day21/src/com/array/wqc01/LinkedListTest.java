package com.array.wqc01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> linkedlist=new LinkedList<String>();
		
		linkedlist.add("a");
		linkedlist.add("b");
		linkedlist.add("c");
		
		linkedlist.addFirst("1");//����ͷ���Ԫ��
		System.out.println(linkedlist);
		
		linkedlist.addLast("d");//����β���Ԫ��
		System.out.println(linkedlist);
		//����б�ĵ�һ��Ԫ��
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

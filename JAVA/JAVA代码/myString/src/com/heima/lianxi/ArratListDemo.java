package com.heima.lianxi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArratListDemo {
public static void main(String[] args) {
	ArrayList<String> arry=new ArrayList<String>();
	arry.add("Hello");
	arry.add("World");
	arry.add("!@#!");
	arry.add("time");
	
	System.out.println(arry);
	
//	System.out.println(arry.get(0));
//	System.out.println(arry.size());
//	System.out.println(arry.remove(0));
//	System.out.println(arry);
//	System.out.println(arry.remove("World"));
//	System.out.println(arry);
	
	arry.listIterator();
	ListIterator<String>  iter=arry.listIterator();
//	for(int i=0;i<arry.size();i++){
//		System.out.println(arry.get(i));
//		
//	}
//	while(iter.hasNext()){
//		System.out.println(iter.next());
//	}
	
	Iterator<String> iter2=arry.iterator();
	
	while(iter2.hasNext()){
		System.out.println(iter2.next());
	}
	
	}
}

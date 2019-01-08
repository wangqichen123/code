package com.mowqc_03;
/*
 * 比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，两个long 类型,并在main方法中进行测试
 * 
 */
public class MethodTest {

	public static void main(String[] args) {
		System.out.println(compare(10,20)); 
		System.out.println(compare((byte)10,(byte)20));
		System.out.println(compare((short)10,(short)20));
		System.out.println(compare(10L,20L));

	}
	//byte
	public static boolean compare(byte a,byte b){
		System.out.println("byte");
		return a==b;
	}
	
	//shout
	public static boolean compare(short a,short b){
		System.out.println("short");
		return a==b;
	}
	//int 
	public static boolean compare(int a,int b){
		System.out.println("int");
		return a==b;
	}
	
	//long
	public static boolean compare(long a,long b){
		System.out.println("long");
		return a==b;
	}
	
	
	
	
}

package com.mowqc_03;
/*
 * 方法重载：在一个类中，出现了方法名相同的情况
 * 方法重载的特点：
 * 		方法名相同，参数列表不同！！与返回值无关.
 * 			参数个数不同
 * 			参数对应的数据类型不同
 * 			
 * 			不能出现方法名相同且参数列表也相同的重载
 * 		注意:
 * 		在调用方法的时候，java虚拟机会通过参数列表不同来区分的方法；
 */
public class MethodDemo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//求和方法
		int result =sum(a,b);
		System.out.println("result"+result);
		
		//定义变量
		int c=30;
		//求和方法
		int result2=sum(a,b,c);
		System.out.println("result2:"+result2);
		
		
	}
	//求三个数据的和
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
	
	
	
	//求和方法
	public static int sum(int a,int b){
		int c=a+b;//或者return a+b;
		return c;
	}
}

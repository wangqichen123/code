package com.mowqc_02;
/*	
 * 写一个方法,传递一个整数(大于1),在控制台打印该数据的值
 * 
 */
public class MethodTest {
	public static void main(String[] args) {
		printNumber(3);
		System.out.println("---");
		printNumber(10);
	}
	/*
	 * 写一个方法,传递一个整数(大于1),在控制台打印该数据的值
	 * 
	 * 两个明确:
	 * 			返回值的类型: void
	 * 			参数列表:int n
	 * 
	 */
		public static void printNumber(int n){
			for(int x=1;x<=n;x++){
				System.out.println(x);
			}
		}
	
	
	
}

package com.mowqc_01;
/*
 * 方法的调用
 * a单独调用
 * b输出调用
 * c赋值调用 ，推荐方式
 */
public class MethodDemo2 {
	public static void main(String[] args){
		//sum(10,20);   单独调用，没有意义
		//输出调用
		
		System.out.println(sum(10,20));
		//有意义，但是不够好，因为我可能需要进一步操作
		
		//赋值调用
		int result =sum(10,20);
		result+=10;
		System.out.println(result);
	}
	
	
	public  static int sum(int a,int b){
		int c=a+b;
		return c;
	}
	
}

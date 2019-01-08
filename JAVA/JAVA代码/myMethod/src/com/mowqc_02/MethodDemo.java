package com.mowqc_02;

import javax.annotation.processing.SupportedSourceVersion;

/*
 * 写一个方法，在控制台输出10次HelloWorld 
 * 
 * 两个明确：
 * 			返回值类型：void
 * 			参数列表：没有参数
 * 方法调用( void 修饰的方法调用	)
 * 只能单独调用
 * 
 */
public class MethodDemo {
	public static void main(String[] args) {
		//3种调用方式
		//单独调用
		//printHelloWorld();
		
		//输出调用(void 所以不能输出调用)
		//System.out.println(printHelloWorld);
		
		//赋值调用
		//void v=printHelloWorld();
	}

	
	/*
	 *  * 写一个方法，在控制台输出10次HelloWorld 
	 * 
	 * 两个明确：
	 * 			返回值类型：void
	 * 			参数列表:
	 * 
	 * 
	 */public static void printHelloWorld(){
		 for(int x=0;x<10;x++){
			 System.out.println("HelloWorld");
		 }
	 }
}


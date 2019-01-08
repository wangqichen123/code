package com.itstar.wqc01;

/**
 * 演示Math类的基本使用
 * @author WQC
 *
 */
public class MathExample {
	public static void main(String[] args) {
		
		double a=0.5;
		//Math.abs(a);
		Math.sqrt(a);
		
		System.out.println(a);
		
		System.out.println(Math.acos(0.5));
		
		System.out.println("向上取整"+Math.ceil(a));
		System.out.println("向下取整"+Math.floor(a));
		System.out.println("四舍五入"+Math.round(a));
		
		System.out.println("随机数"+Math.random()*a);
	}
}

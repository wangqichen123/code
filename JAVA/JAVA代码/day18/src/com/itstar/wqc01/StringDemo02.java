package com.itstar.wqc01;
/**
 * String split
 * @author WQC
 *
 */
public class StringDemo02 {
	
	public static void main(String[] args) {
		
		String str="1000,2000,2000,3000,888";
		
		//给的是 字符串  计算这些总和
	int	salary=salary(str, ",");
	System.out.println("这些数的总和为");
		
	}
	/*
	 * 通过split方法 获得 根据  进行分割 
	 * 字符串数组
	 * 类型转换  字符转换为数字
	 * ValueOf 方法  把字符串转换为数字
	 * 最后求和
	 * */
	public static int salary(String str,String regex){
		int salary=0;
		//1  split 字符串
		String[] resules=str.split("regex");
		//2  进行遍历
		for(int i=0;i<resules.length;i++){
			
			//3 类型转化
			int temp=Integer.valueOf(resules[i]);
			//4 求和
			salary+=temp;
		}
		
		
		return salary;
		
	}
}

package com.itstar.wqc02;

import java.util.Scanner;
/**
 * 验证手机号 是否合法
 * @author WQC
 *	(1)手机号以1开头
 *	（2）手机号码11位
 *	 （3） 手机号码 第2位 3,4,5,6,7,8,9 
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		//static 方法只能调用 static 方法
	Scanner sc=new Scanner(System.in);
	
	System.out.println("输入要验证的手机号码");
	String phone=sc.nextLine();
	String regex="[1][3-9]\\d{9}";
		
	CheckPhone(phone,regex);

		
	}
	/**
	 * 手机号 phoneNum
	 * 规则表达式 regex
	 * String 自带的 matches 方法
	 */
	public static void CheckPhone(String phoneNum,String regex){
		
		if(phoneNum.matches(regex)){
			System.out.println("合法手机号");
		}else{
			System.out.println("不合法手机号");
		}
	}
	
}

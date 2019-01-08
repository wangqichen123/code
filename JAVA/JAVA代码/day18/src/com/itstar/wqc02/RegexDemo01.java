package com.itstar.wqc02;

import java.util.Scanner;
/**
 * 验证qq 是否合法
 * @author WQC
 *
 */
public class RegexDemo01 {
	public static void main(String[] args) {
		//static 方法只能调用 static 方法
	Scanner sc=new Scanner(System.in);
	
	System.out.println("输入要验证的QQ号码");
	String qq=sc.nextLine();
	String regex="[1-9]\\d{4,14}";//转义
		
		checkQQ(qq,regex);
		
		
	}
	
	public static void checkQQ(String qq,String regex){
		
		boolean flag=qq.matches(regex);
		
		if(flag){
			
			System.out.println("QQ合法");
		}else{
			System.out.println("QQ不合法");
		}
	}
		
	
}

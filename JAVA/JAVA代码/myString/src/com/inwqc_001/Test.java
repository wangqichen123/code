package com.inwqc_001;

import java.util.Scanner;

public class Test {
 public static void main(String[] args) {
	
	String mi="wqc123456";
	int i;
	for(i=0;i<3;i++){
		System.out.println("请输入密码");
		Scanner password=new Scanner(System.in);
		if(mi.equals(password.nextLine())){
		System.out.println("登陆成功");
		break;
		}
		System.out.println("请重试还有"+(3-i-1)+"次机会");
		if(i==2){
			System.out.println("3次输入错误，程序退出");
		}
	}
	 
}
 
}

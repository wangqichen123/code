package com.itstar.wqc02;

import java.util.Scanner;
/**
 * 验证邮箱 是否合法
 * @author WQC
 * 
 * 列如 QQ邮箱   雅虎邮箱
 * 123@qq.com  yahuo.com.cn
 *	(1)@ 前半部分  邮箱的名字 字母 数字 下划线 都可以[a-zA-Z-9_-]
 *	（2）@
 *	 （3）  @ 后半部分 \w+\.{2,3}  
 *	+
 */
public class RegexDemo3 {
	public static void main(String[] args) {
		//static 方法只能调用 static 方法
	Scanner sc=new Scanner(System.in);
	
	System.out.println("输入要验证的邮箱");
	String mail=sc.nextLine();
	String regex="[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.\\w+{2,3})+";
	}
}
//	}	
//	CheckMail(mail,regex);
//
//		
//	}
//	/**
//	 * 手机号 phoneNum
//	 * 规则表达式 regex
//	 * String 自带的 matches 方法
//	 */
//	public static void CheckPhone(String phoneNum,String regex){
//		
//		if(phoneNum.matches(regex)){
//			System.out.println("合法手机号");
//		}else{
//			System.out.println("不合法手机号");
//		}
//	}
//	
//}

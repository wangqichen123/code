package com.itstar.wqc02;

import java.util.Scanner;
/**
 * ��֤���� �Ƿ�Ϸ�
 * @author WQC
 * 
 * ���� QQ����   �Ż�����
 * 123@qq.com  yahuo.com.cn
 *	(1)@ ǰ�벿��  ��������� ��ĸ ���� �»��� ������[a-zA-Z-9_-]
 *	��2��@
 *	 ��3��  @ ��벿�� \w+\.{2,3}  
 *	+
 */
public class RegexDemo3 {
	public static void main(String[] args) {
		//static ����ֻ�ܵ��� static ����
	Scanner sc=new Scanner(System.in);
	
	System.out.println("����Ҫ��֤������");
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
//	 * �ֻ��� phoneNum
//	 * ������ʽ regex
//	 * String �Դ��� matches ����
//	 */
//	public static void CheckPhone(String phoneNum,String regex){
//		
//		if(phoneNum.matches(regex)){
//			System.out.println("�Ϸ��ֻ���");
//		}else{
//			System.out.println("���Ϸ��ֻ���");
//		}
//	}
//	
//}

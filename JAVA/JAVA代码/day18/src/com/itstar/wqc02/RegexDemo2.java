package com.itstar.wqc02;

import java.util.Scanner;
/**
 * ��֤�ֻ��� �Ƿ�Ϸ�
 * @author WQC
 *	(1)�ֻ�����1��ͷ
 *	��2���ֻ�����11λ
 *	 ��3�� �ֻ����� ��2λ 3,4,5,6,7,8,9 
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		//static ����ֻ�ܵ��� static ����
	Scanner sc=new Scanner(System.in);
	
	System.out.println("����Ҫ��֤���ֻ�����");
	String phone=sc.nextLine();
	String regex="[1][3-9]\\d{9}";
		
	CheckPhone(phone,regex);

		
	}
	/**
	 * �ֻ��� phoneNum
	 * ������ʽ regex
	 * String �Դ��� matches ����
	 */
	public static void CheckPhone(String phoneNum,String regex){
		
		if(phoneNum.matches(regex)){
			System.out.println("�Ϸ��ֻ���");
		}else{
			System.out.println("���Ϸ��ֻ���");
		}
	}
	
}

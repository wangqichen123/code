package com.itstar.wqc02;

import java.util.Scanner;
/**
 * ��֤qq �Ƿ�Ϸ�
 * @author WQC
 *
 */
public class RegexDemo01 {
	public static void main(String[] args) {
		//static ����ֻ�ܵ��� static ����
	Scanner sc=new Scanner(System.in);
	
	System.out.println("����Ҫ��֤��QQ����");
	String qq=sc.nextLine();
	String regex="[1-9]\\d{4,14}";//ת��
		
		checkQQ(qq,regex);
		
		
	}
	
	public static void checkQQ(String qq,String regex){
		
		boolean flag=qq.matches(regex);
		
		if(flag){
			
			System.out.println("QQ�Ϸ�");
		}else{
			System.out.println("QQ���Ϸ�");
		}
	}
		
	
}

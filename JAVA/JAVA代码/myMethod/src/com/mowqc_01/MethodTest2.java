package com.mowqc_01;

import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args){
			//��������¼�����
		Scanner sc=new Scanner(System.in);
		//��������
		System.out.println("�������һ������");
		int x=sc.nextInt();
		System.out.println("������ڶ�������");
		int y=sc.nextInt();
		//���÷���
		boolean b=compare(x,y);
		
		//������
		System.out.println("b:"+b);
	}
	
	/*
	 * �Ƚ��������Ƿ����	
	 * 
	 * ������ȷ:
	 * 		����ֵ����:boolean����
	 * 		�����б�:int a ,int b
	 * 
	 *
	 */
	public static boolean compare(int a,int b){
		if(a==b){
			return true;
		}else{
			return false;
		}
	}
	
	
}

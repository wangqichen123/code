package com.mowqc_01;

import java.util.Scanner;

/*
 * ����¼���������ݣ������������ݵ����ֵ
 * 
 */
public class MethondDemo3 {	 
	public static void main(String[] args){
		//��������¼�����
		Scanner sc=new Scanner(System.in);
		//��������
		System.out.println("�������һ������");
		int a=sc.nextInt();
		System.out.println("������ڶ�������");
		int b=sc.nextInt();
		System.out.println("���������������");
		int c=sc.nextInt();
		
		//���÷���
		int max=getMax(a,b,c);
		//������
		System.out.println("max"+max);
	}

	
	public static int getMax(int a,int b,int c){
		if(a>b){
			if(a>c){
				return a;
			}else{
				return c;
			}
		}else{
			if(b>c){
				return b;
			}else{
				return c;
			}
		}
	}
	
}

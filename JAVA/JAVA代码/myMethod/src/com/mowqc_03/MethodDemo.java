package com.mowqc_03;
/*
 * �������أ���һ�����У������˷�������ͬ�����
 * �������ص��ص㣺
 * 		��������ͬ�������б�ͬ�����뷵��ֵ�޹�.
 * 			����������ͬ
 * 			������Ӧ���������Ͳ�ͬ
 * 			
 * 			���ܳ��ַ�������ͬ�Ҳ����б�Ҳ��ͬ������
 * 		ע��:
 * 		�ڵ��÷�����ʱ��java�������ͨ�������б�ͬ�����ֵķ�����
 */
public class MethodDemo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//��ͷ���
		int result =sum(a,b);
		System.out.println("result"+result);
		
		//�������
		int c=30;
		//��ͷ���
		int result2=sum(a,b,c);
		System.out.println("result2:"+result2);
		
		
	}
	//���������ݵĺ�
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
	
	
	
	//��ͷ���
	public static int sum(int a,int b){
		int c=a+b;//����return a+b;
		return c;
	}
}

package com.mowqc_01;
/*
 * �����ĵ���
 * a��������
 * b�������
 * c��ֵ���� ���Ƽ���ʽ
 */
public class MethodDemo2 {
	public static void main(String[] args){
		//sum(10,20);   �������ã�û������
		//�������
		
		System.out.println(sum(10,20));
		//�����壬���ǲ����ã���Ϊ�ҿ�����Ҫ��һ������
		
		//��ֵ����
		int result =sum(10,20);
		result+=10;
		System.out.println(result);
	}
	
	
	public  static int sum(int a,int b){
		int c=a+b;
		return c;
	}
	
}

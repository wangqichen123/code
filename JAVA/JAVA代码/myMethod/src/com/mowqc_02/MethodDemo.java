package com.mowqc_02;

import javax.annotation.processing.SupportedSourceVersion;

/*
 * дһ���������ڿ���̨���10��HelloWorld 
 * 
 * ������ȷ��
 * 			����ֵ���ͣ�void
 * 			�����б�û�в���
 * ��������( void ���εķ�������	)
 * ֻ�ܵ�������
 * 
 */
public class MethodDemo {
	public static void main(String[] args) {
		//3�ֵ��÷�ʽ
		//��������
		//printHelloWorld();
		
		//�������(void ���Բ����������)
		//System.out.println(printHelloWorld);
		
		//��ֵ����
		//void v=printHelloWorld();
	}

	
	/*
	 *  * дһ���������ڿ���̨���10��HelloWorld 
	 * 
	 * ������ȷ��
	 * 			����ֵ���ͣ�void
	 * 			�����б�:
	 * 
	 * 
	 */public static void printHelloWorld(){
		 for(int x=0;x<10;x++){
			 System.out.println("HelloWorld");
		 }
	 }
}


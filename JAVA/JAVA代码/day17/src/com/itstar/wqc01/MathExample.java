package com.itstar.wqc01;

/**
 * ��ʾMath��Ļ���ʹ��
 * @author WQC
 *
 */
public class MathExample {
	public static void main(String[] args) {
		
		double a=0.5;
		//Math.abs(a);
		Math.sqrt(a);
		
		System.out.println(a);
		
		System.out.println(Math.acos(0.5));
		
		System.out.println("����ȡ��"+Math.ceil(a));
		System.out.println("����ȡ��"+Math.floor(a));
		System.out.println("��������"+Math.round(a));
		
		System.out.println("�����"+Math.random()*a);
	}
}

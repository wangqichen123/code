package com.itstar.edu;

import java.util.Random;

/**
 * 
 * @author WQC
 * @version 1.0
 *
 */

public class RandomDemo {
	public static void main(String[] args) {
			String[] strname=new String[10];
			//ѧ����ʼ������
			addStudent(strname);
			
			
			for(int x=0;x<10;x++){
				String name=randCallName(strname);
				System.out.println("��"+x+"�ε���Ϊ"+name);
			}
	}
	
	
	public static void addStudent(String[] strname){
		for(int i=0;i<strname.length;i++){
			strname[i]="��"+i;
			System.out.println(strname[i]);
		}
	}
	
	public static String randCallName(String[] strname){
		//ʹ��random��
		Random rand=new Random();
		//ʹ���������Χ 0-length-1
		int index=rand.nextInt(strname.length);
		String name=strname[index];
		return null;
		
	}
}

package com.inwqc_001;

import java.util.Scanner;

public class Test {
 public static void main(String[] args) {
	
	String mi="wqc123456";
	int i;
	for(i=0;i<3;i++){
		System.out.println("����������");
		Scanner password=new Scanner(System.in);
		if(mi.equals(password.nextLine())){
		System.out.println("��½�ɹ�");
		break;
		}
		System.out.println("�����Ի���"+(3-i-1)+"�λ���");
		if(i==2){
			System.out.println("3��������󣬳����˳�");
		}
	}
	 
}
 
}

package com.itstar.wqc01;

public class SaleTickets {
	
	public static void main(String[] args) {
		
		//1 ��ʼ��Ʊ��
		Ticket tk=new Ticket(100);
		//2 �½�����
		Thread thread=new Thread(tk);
		thread.setName("A����");
		Thread thread2=new Thread(tk);
		thread2.setName("B����");
		
		//3 ��Ʊ����
		thread.start();
		thread2.start();
		
		
	}
}

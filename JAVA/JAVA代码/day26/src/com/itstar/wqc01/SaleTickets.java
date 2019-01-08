package com.itstar.wqc01;

public class SaleTickets {
	
	public static void main(String[] args) {
		
		//1 初始化票额
		Ticket tk=new Ticket(100);
		//2 新建窗口
		Thread thread=new Thread(tk);
		thread.setName("A窗口");
		Thread thread2=new Thread(tk);
		thread2.setName("B窗口");
		
		//3 卖票过程
		thread.start();
		thread2.start();
		
		
	}
}

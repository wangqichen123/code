package com.itstar.wqc02;

public class MyThreadTest {
	public static void main(String[] args) {
		
		MyThread myThread=new MyThread("�߳�1");
		
		MyThread myThread2=new MyThread("�߳�2");
		//ֱ�ӵ���run ���� �޷��ɹ������߳�  �൱�ڵ�����һ����ͨ�ķ���
//		myThread.run();
//		myThread2.run();
		
		myThread.start();
		myThread2.start(); 
	}
}

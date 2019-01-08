package com.itstar.wqc02;

public class MyThreadTest {
	public static void main(String[] args) {
		
		MyThread myThread=new MyThread("线程1");
		
		MyThread myThread2=new MyThread("线程2");
		//直接调用run 方法 无法成功开启线程  相当于调用了一个普通的方法
//		myThread.run();
//		myThread2.run();
		
		myThread.start();
		myThread2.start(); 
	}
}

package com.itstar.wqc02;
/**
 * 方法2 实现runnable接口
 * 
 * @author WQC
 *
 */
public class MyRunnableTest {
	public static void main(String[] args) {
		
		MyRunnable myRunnable=new MyRunnable();
		Thread thread=new Thread(myRunnable);
		thread.setName("线程1");
		thread.start();
		
		Thread thread2=new Thread(myRunnable);
		thread2.setName("线程2");
		thread2.start();
		
	}
}

package com.itstar.wqc02;
/**
 * 方法1 继承 thread类 
 * @author WQC
 *
 */
public class MyThread extends Thread{

	public MyThread(String name){
		
		super(name);
	}
	
	//重写run 方法
	public void run(){
		for(int i=0;i<10;i++){
			
			System.out.println(Thread.currentThread().getName()+"---->"+i);
		}
	}
}

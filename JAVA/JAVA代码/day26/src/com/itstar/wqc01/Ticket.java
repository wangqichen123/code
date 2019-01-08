package com.itstar.wqc01;
/**
 * 同步代码块
 * 同步方法
 * 锁
 * @author WQC
 *
 */
public class Ticket implements Runnable{

	//飘得总数
	private int total;
	
	//无参构造函数
	Ticket(){
			
	}
	//带参构造函数
	Ticket(int total){
		this.total=total;
	}
	
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(total>0){
			//卖出一张票
			total--;
			//打印出那个窗口在卖票
			String window=Thread.currentThread().getName();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(window+"卖了一张票"+"还剩"+total+"票");
		}
		
	}
	
	
}

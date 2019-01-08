package com.itster.demo01;
/**
 * 
 * @author WQC
 *
 */

public /*abstract*/ class  HPprinter extends Printer {

	//方法的重写--如果继承抽象类 必须得重写抽象类中的方法
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("惠普打印机在打印。。");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("惠普打印机在自检..");
	}

}

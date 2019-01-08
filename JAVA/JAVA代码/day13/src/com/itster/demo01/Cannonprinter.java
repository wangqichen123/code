package com.itster.demo01;
/**
 * 继承抽象类printer
 * @author WQC
 *
 */
public class   Cannonprinter extends Printer {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("佳能打印机在打印..");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("佳能打印机在自检..");
	}

}

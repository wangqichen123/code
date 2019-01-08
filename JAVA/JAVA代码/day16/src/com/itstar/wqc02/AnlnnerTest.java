package com.itstar.wqc02;
/**
 * 通过匿名内部类的方法实现 Printer 接口
 * @author WQC
 *
 */
public class AnlnnerTest {
	
	public static void main(String[] args) {
			
		HPprinter hp=new HPprinter();
		hp.print();
		
		//方式2 通过匿名内部类的方式
		//
		//Printer printer =new Printer();
		Printer printer =new Printer(){//匿名内部类

			public void print() {
				
				
				System.out.println("方式2 匿名内部类惠普打印");
			}
			
			
			
		};
		printer.print();
	}
}

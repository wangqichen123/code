package com.itstar.wqc02;
/**
 * ͨ�������ڲ���ķ���ʵ�� Printer �ӿ�
 * @author WQC
 *
 */
public class AnlnnerTest {
	
	public static void main(String[] args) {
			
		HPprinter hp=new HPprinter();
		hp.print();
		
		//��ʽ2 ͨ�������ڲ���ķ�ʽ
		//
		//Printer printer =new Printer();
		Printer printer =new Printer(){//�����ڲ���

			public void print() {
				
				
				System.out.println("��ʽ2 �����ڲ�����մ�ӡ");
			}
			
			
			
		};
		printer.print();
	}
}

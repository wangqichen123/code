package com.itster.demo01;
/**
 * ���Գ�����
 * @author WQC
 *	�����ĸ�ʽ ��
 *  abstract class ���� {}---������
 *  
 *  ���һ����̳г����࣬�������ȫʵ������󷽷�����������Ϊ������
 *  ���󷽷������� public ��   protected ����
 *  ���ܹ��� private �� static ����
 */
public class AbstractTest01 {
	public static void main(String[] args) {
		//�����಻�ܹ�����ʵ���� ���ܹ���������
		
		//Printer p=new Printer();
		//������ ͨ���������ʵ���� 
		Printer printer =new HPprinter();
		//�̳г��������  �ɷ����ʵ����
		HPprinter hp=new HPprinter();
		Cannonprinter canno=new Cannonprinter();
		
		hp.print();
		hp.check();
		
		canno.check();
		canno.print();
		
	}
}

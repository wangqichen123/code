package com.itstar.wqc01;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo {
	
	public static void main(String[] args) {
		
		//1  ��ʼ��
		DateFormat dat=DateFormat.getDateInstance();
		//2 ����format ���� ������ת��Ϊ�ַ���
		String sdate=dat.format(new Date());
		
		System.out.println(sdate);
		//3 ���ַ������͵�����ת��Ϊ���ڸ�ʽ
		
		
//		Date date=dateFormat.parse(sdate);
		
		System.out.println(new Date());
	}
}

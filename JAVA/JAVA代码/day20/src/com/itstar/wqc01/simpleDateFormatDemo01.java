package com.itstar.wqc01;

import java.text.SimpleDateFormat;

import java.util.Calendar;
public class simpleDateFormatDemo01 {
	public static void main(String[] args) {
		//��ʼ������
		Calendar calendar=Calendar.getInstance();
		
		SimpleDateFormat smf=new SimpleDateFormat();
		String pattern="yyyy��MM��dd��";
		String pattern2="YYYY��MM��DD��";
		smf.applyPattern(pattern);
		
		System.out.println("yyyy��MM��dd�� ���:");
		System.out.println(smf.format(calendar.getTime()));
		smf.applyPattern(pattern2);
		System.out.println("YYYY��MM��DD�� ���:");
		System.out.println(smf.format(calendar.getTime()));
		//1 ��ν��ַ���ת��Ϊʱ��
		String s="2018��12��15��  ������08ʱ00��00��";
		
		String pattern3="yyyy��MM��dd�� E  HHʱmm��ss��";
		
		smf.applyPattern(pattern3);
		
//		Date date= smf.parse(s);
	}
}

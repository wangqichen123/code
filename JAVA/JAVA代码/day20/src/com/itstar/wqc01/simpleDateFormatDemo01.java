package com.itstar.wqc01;

import java.text.SimpleDateFormat;

import java.util.Calendar;
public class simpleDateFormatDemo01 {
	public static void main(String[] args) {
		//初始化日期
		Calendar calendar=Calendar.getInstance();
		
		SimpleDateFormat smf=new SimpleDateFormat();
		String pattern="yyyy年MM月dd日";
		String pattern2="YYYY年MM月DD日";
		smf.applyPattern(pattern);
		
		System.out.println("yyyy年MM月dd日 输出:");
		System.out.println(smf.format(calendar.getTime()));
		smf.applyPattern(pattern2);
		System.out.println("YYYY年MM月DD日 输出:");
		System.out.println(smf.format(calendar.getTime()));
		//1 如何将字符串转换为时间
		String s="2018年12月15日  星期三08时00分00秒";
		
		String pattern3="yyyy年MM月dd日 E  HH时mm分ss秒";
		
		smf.applyPattern(pattern3);
		
//		Date date= smf.parse(s);
	}
}

package com.itstar.wqc01;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo {
	
	public static void main(String[] args) {
		
		//1  初始化
		DateFormat dat=DateFormat.getDateInstance();
		//2 调用format 方法 将日期转换为字符串
		String sdate=dat.format(new Date());
		
		System.out.println(sdate);
		//3 将字符串类型的日期转换为日期格式
		
		
//		Date date=dateFormat.parse(sdate);
		
		System.out.println(new Date());
	}
}

package com.itstar.wqc02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class LiveDays {
	
	public static void main(String[] args) {
		
		
		System.out.println("请输入你的出生日期");
		Scanner sc=new Scanner(System.in);
		String birthday=sc.nextLine();
		//日期转换
		
		SimpleDateFormat smf=new SimpleDateFormat();
		String pattern="yyyy-MM-dd";
		//当生成日期格式是要注意 apply
		smf.applyPattern(pattern);
		Date birthDate=null;
		try {
			 birthDate=smf.parse(birthday);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date now =new Date();
		//获取出生日期
		//根据出生日期计算天数
		long day1=calDays(birthDate,now);
		//返回天数
		
	}
	/*@param Date
	 * @return day
	 * 
	 * 计算某两个日期之间的间隔
	 */
	public static long calDays(Date beforDate,Date afterDate){
		long days=0;
		
		long beforeMS=beforDate.getTime();
		long afterMS=afterDate.getTime();
		
		days=((afterMS-beforeMS)/1000/60/60/24);
		return days;
	}
}

package com.itstar.wqc02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class LiveDays {
	
	public static void main(String[] args) {
		
		
		System.out.println("��������ĳ�������");
		Scanner sc=new Scanner(System.in);
		String birthday=sc.nextLine();
		//����ת��
		
		SimpleDateFormat smf=new SimpleDateFormat();
		String pattern="yyyy-MM-dd";
		//���������ڸ�ʽ��Ҫע�� apply
		smf.applyPattern(pattern);
		Date birthDate=null;
		try {
			 birthDate=smf.parse(birthday);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date now =new Date();
		//��ȡ��������
		//���ݳ������ڼ�������
		long day1=calDays(birthDate,now);
		//��������
		
	}
	/*@param Date
	 * @return day
	 * 
	 * ����ĳ��������֮��ļ��
	 */
	public static long calDays(Date beforDate,Date afterDate){
		long days=0;
		
		long beforeMS=beforDate.getTime();
		long afterMS=afterDate.getTime();
		
		days=((afterMS-beforeMS)/1000/60/60/24);
		return days;
	}
}

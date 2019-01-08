package com.itstar.wqc03;
/**
 * 
 * @author WQC
 *
 */
import java.util.Date;
public class DateTest {
	public static void main(String[] args) {
		
		//以毫秒计算  为单位的    距离就是 1970年 0点 0秒   0分
		Date date=new Date(0);//时间原点
		System.out.println(date);
		//当前时间
		Date now=new Date();
		System.out.println(now.getTime());
		
	}
}

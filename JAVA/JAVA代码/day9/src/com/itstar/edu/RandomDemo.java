package com.itstar.edu;

import java.util.Random;

/**
 * 
 * @author WQC
 * @version 1.0
 *
 */

public class RandomDemo {
	public static void main(String[] args) {
			String[] strname=new String[10];
			//学生初始化姓名
			addStudent(strname);
			
			
			for(int x=0;x<10;x++){
				String name=randCallName(strname);
				System.out.println("第"+x+"次点名为"+name);
			}
	}
	
	
	public static void addStudent(String[] strname){
		for(int i=0;i<strname.length;i++){
			strname[i]="王"+i;
			System.out.println(strname[i]);
		}
	}
	
	public static String randCallName(String[] strname){
		//使用random类
		Random rand=new Random();
		//使用随机数范围 0-length-1
		int index=rand.nextInt(strname.length);
		String name=strname[index];
		return null;
		
	}
}

package com.itstar.wqc02;
/**
 * 统计 大写字母 小写字母  出现的次数
 * @author  WQC
 * @version 1.0
 */
public class StringDemo01{
	public static void main(String[] args){
		
		String s="ASDFQWERT123yuiopzxcbnm7890%@";
		getCount(s);
		
		
	}
	public static void getCount(String s){
		//记录大小写字母 数字出现次数
		
		int upper=0;
		int lower=0;
		int digit=0;
		//for 循环遍历   对字符串中每一个字符进行比对
		
		for(int i=0;i<s.length();i++){
			//定义一个char  用来存储我们每个字符串中字符
			char c=s.charAt(i);
			//通过 AscII 码值 来判断  数字  48 大写字母 65 小写字母 97
			
			if(c>=48&&c<=57){
				
				digit++;
			}else if(c>='A'&&c<='Z'){
				
				upper++;
			}else if(c>='a'&&c<='z'){
				lower++;
			}
			
		}
			System.out.println("数字的个数为:"+digit);
			System.out.println("大写字母的个数为:"+upper);
			System.out.println("小写字母的个数为:"+lower);
			System.out.println("字符总长度为"+s.length());
	}
	
}

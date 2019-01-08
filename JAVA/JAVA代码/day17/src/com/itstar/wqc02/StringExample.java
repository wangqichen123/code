package com.itstar.wqc02;

public class StringExample {

	public static void main(String[] args) {
		
		String str="abc123  789";
		
		
		System.out.println(str.charAt(0));//返回在第一个位置的值
		
		System.out.println("是否含有123:"+str.contains("123"));
		System.out.println("是否含有774:"+str.contains("774"));
		
		if(/*str=="abc123  789"*/str.equals("abc123  789")){
			
			System.out.println("字符串相等");
		}
		System.out.println(str.indexOf("123"));//123从哪里开始
		
		System.out.println(str.length());
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));//输出每一个索引处的值
		}
		//str 调用函数后，需要将返回值重新付给 str
		str=str.replace("123", "666");
		System.out.println(str);
		
		System.out.println(str.substring(1,3));//含头不含尾  abc123  789
		
		System.out.println(str.toUpperCase());
		//用于从字符串的开始和结尾删除空格
		System.out.println(str.trim());
		
		
	}
	
	
	
}

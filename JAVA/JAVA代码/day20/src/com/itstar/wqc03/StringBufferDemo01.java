package com.itstar.wqc03;

public class StringBufferDemo01 {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		sb.append("A");
		sb.append("B");
		
		String s="你好，爱学习";
		s+="123";
		sb.append(s);
		System.out.println(sb);
	
		//insert--比String 更灵活
		sb.insert(5,"软件" );//在字符串第5个地方加上  软件
		System.out.println(sb);
		//reverse
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.toString());
	}
}

package com.itstar.wqc03;

public class StringBufferDemo01 {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		sb.append("A");
		sb.append("B");
		
		String s="��ã���ѧϰ";
		s+="123";
		sb.append(s);
		System.out.println(sb);
	
		//insert--��String �����
		sb.insert(5,"���" );//���ַ�����5���ط�����  ���
		System.out.println(sb);
		//reverse
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.toString());
	}
}

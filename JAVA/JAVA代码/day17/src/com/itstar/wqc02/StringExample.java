package com.itstar.wqc02;

public class StringExample {

	public static void main(String[] args) {
		
		String str="abc123  789";
		
		
		System.out.println(str.charAt(0));//�����ڵ�һ��λ�õ�ֵ
		
		System.out.println("�Ƿ���123:"+str.contains("123"));
		System.out.println("�Ƿ���774:"+str.contains("774"));
		
		if(/*str=="abc123  789"*/str.equals("abc123  789")){
			
			System.out.println("�ַ������");
		}
		System.out.println(str.indexOf("123"));//123�����￪ʼ
		
		System.out.println(str.length());
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));//���ÿһ����������ֵ
		}
		//str ���ú�������Ҫ������ֵ���¸��� str
		str=str.replace("123", "666");
		System.out.println(str);
		
		System.out.println(str.substring(1,3));//��ͷ����β  abc123  789
		
		System.out.println(str.toUpperCase());
		//���ڴ��ַ����Ŀ�ʼ�ͽ�βɾ���ո�
		System.out.println(str.trim());
		
		
	}
	
	
	
}

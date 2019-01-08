package com.inwqc_001;
/*
 * int indexOF(String str)
 */
public class Test2 {
	public static void main(String[] args) {
		String str="HelloWorld";
				//System.out.println(str.charAt(0));
	            //System.out.println(str.indexOf("H"));
				String str2=str.substring(5);
				str2=str.substring(3,5);
				System.out.println(str2);
				char []chr=new char[5];
				chr="wqc".toCharArray();
				System.out.println(chr);
				
//				String chr3="HELloWoRLd".toLowerCase();
//				System.out.println(chr3);
//				String cha4="helloWorld".toUpperCase();
//				System.out.println(cha4);
				String src2="HellodwadjiawdjowaFF";
				src2="HellodwadjiawdjowaFF".substring(0, 1).toUpperCase()+src2.substring(1).toLowerCase();
				System.out.println(src2);
				
	}
}

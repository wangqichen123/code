package com.heima.lianxi;

public class IfForWhileDemo {
public static void main(String[] args) {
	String str="HelloWorld";
	String[]str2=new String[3];
	str2[0]="Hello";
	str2[1]="World";
	str2[2]="!!";
	
	//for(int i=0;i<str2.length;i++){
		//System.out.println(str2[i]);
		
		
//		for(int i=(str2.length)-1;i>=0;i--){
//			System.out.println(str2[i]);
//	}
	int i=0;
	while(i<3){
		System.out.println(str2[i++]);
				
	}
		
		
}
}
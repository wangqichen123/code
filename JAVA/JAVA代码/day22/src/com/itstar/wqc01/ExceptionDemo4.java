package com.itstar.wqc01;

import java.io.FileNotFoundException;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		
			try{
//				test(1);
					
//			}catch(FileNotFoundException e){
//				e.printStackTrace();
			}catch(Exception e){
				
			}
	}
	
	
	public static int getArrayLenght(int[] arry) throws Exception{
		int i=0;
		if(arry==null){
			throw new  Exception("������û��ֵ");
		}
		if(arry.length<1){
			throw new Exception("������û��Ԫ��");
		}
		return i;
	}
}

package com.itstar.wqc01;

public class ExceptionDemo02 {
	public static void main(String[] args) {
		
		int[] arry=null;
		
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

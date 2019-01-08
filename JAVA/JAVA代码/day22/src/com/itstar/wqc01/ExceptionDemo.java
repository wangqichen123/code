package com.itstar.wqc01;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		int[] sc={30,50,120,-77,99};
		int avg=getAvg(sc);
		System.out.println("·ÖÊýÎª"+avg);
	}
	public static int getAvg(int[] sc){
		
		int avg=0;
		int sum=0;
		int count=0;
		if(sc!=null){
			for(int i=0;i<sc.length;i++){
				if(sc[i]<0){
					try{
					throw new NeNumberException(""+sc[i]);
				}catch(Exception e){
					
				}
				count++;
				sum+=sc[i];
			}
	
		}
		
	}
		avg=sum/count;
		return avg;
	
	}
}

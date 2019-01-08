package com.Array_01;
/*
 * 找出数组的最大值或	最小值	
 * 
 * 
 */
public class ArrayDemo02 {
public static void main(String[] args) {
	//声明数组并且赋值
	int [] arr=new int[]{1,3,5,7,9,4,23,5};
	//定义一份整形值来存储最大值
	int max=arr[0];
	//for 循环遍历
	for(int i=0;i<arr.length;i++){
		if(max<arr[i]){
			//定义的max值小于arr数组中的值
			//将arr数组i中的值赋值给max；
			max=arr[i];
		}
	}
	System.out.println("max:"+max);
	
	//最小值
	int min=arr[1];
	for(int i=0;i<arr.length;i++){
		if(min>arr[i]){
			min=arr[i];
		}
		
	}
	System.out.println("min:"+min);
	
	
}


}

package com.Array_02;

public class MyArrayDemo {

	private void MyArray() {
	}
	
	public static int themax(int[] arr){
		int max=0;
		for(int x=0;x<arr.length;x++){
			if(x<arr[x]){
				x=arr[x];
			}
		}
		return max;
	}
	
	public static int index(int[] arr,int a){
		for(int x=0;x<arr.length;x++){
			if(arr[x]==a){
				return x;
			}
		}
		return -1;
	}
}

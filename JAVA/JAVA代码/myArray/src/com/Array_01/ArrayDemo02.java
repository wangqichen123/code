package com.Array_01;
/*
 * �ҳ���������ֵ��	��Сֵ	
 * 
 * 
 */
public class ArrayDemo02 {
public static void main(String[] args) {
	//�������鲢�Ҹ�ֵ
	int [] arr=new int[]{1,3,5,7,9,4,23,5};
	//����һ������ֵ���洢���ֵ
	int max=arr[0];
	//for ѭ������
	for(int i=0;i<arr.length;i++){
		if(max<arr[i]){
			//�����maxֵС��arr�����е�ֵ
			//��arr����i�е�ֵ��ֵ��max��
			max=arr[i];
		}
	}
	System.out.println("max:"+max);
	
	//��Сֵ
	int min=arr[1];
	for(int i=0;i<arr.length;i++){
		if(min>arr[i]){
			min=arr[i];
		}
		
	}
	System.out.println("min:"+min);
	
	
}


}

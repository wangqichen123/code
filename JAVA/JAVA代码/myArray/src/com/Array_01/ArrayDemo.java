package com.Array_01;
/*
 * ��������ͬ�������͵�һ�����ݼ���  4��8�ֵĻ�����������
 * ����������--����ͬ����ֵ
 * �У�
 * 		football[7]-->c��
 * 		Basketball[23]-->�ǵ�
 * 		��ͬ����ӿ��Կ��ɲ�ͬ������
 * 		ͬһ��������棬ÿ����Ա�ı����Ψһ��;
 * 		����ĳ��ȹ̶���
 * 		�У�
 * 		int [] array;
 * (2) ��ʼ������
 *    a:����Ҫȷ������Ĵ�С
 *
 *    �����ʱ��ֱ��ȷ�� dataTyoe[] array=new dataType[size];
 *    
 *    dataType[] array;
 *    array=new dataType[size];
 *  (3) ����ĸ�ֵ
 *  �������Ԫ�ؽ��и�ֵ
 *  a ����̬��ֵ;
 *  (4)  for ѭ����������
 *  for(int i=0;i<arr.length;i++)
 *  
 *    1 2 3�ϲ�����̬��ֵ
 *    int [] arr=new int []{1,2,3};
 *    
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//����һ������
		//int [] arr;
		//��ʼ����С
		//arr=new int [3];
		int [] arr=new int [3];
		
		arr[0]=1;
		arr[2]=2;
		arr[1]=3;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
		
	}
}

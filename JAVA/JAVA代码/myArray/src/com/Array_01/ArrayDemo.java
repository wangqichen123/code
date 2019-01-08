package com.Array_01;
/*
 * 数组是相同数据类型的一组数据集合  4类8种的基本数据类型
 * 数组有索引--代表不同的数值
 * 列：
 * 		football[7]-->c罗
 * 		Basketball[23]-->乔丹
 * 		不同的球队可以看成不同的数组
 * 		同一个球队里面，每个球员的编号是唯一的;
 * 		数组的长度固定。
 * 		列：
 * 		int [] array;
 * (2) 初始化数组
 *    a:首先要确定数组的大小
 *
 *    定义的时候直接确定 dataTyoe[] array=new dataType[size];
 *    
 *    dataType[] array;
 *    array=new dataType[size];
 *  (3) 数组的赋值
 *  给数组的元素进行赋值
 *  a ：动态赋值;
 *  (4)  for 循环遍历数组
 *  for(int i=0;i<arr.length;i++)
 *  
 *    1 2 3合并，静态赋值
 *    int [] arr=new int []{1,2,3};
 *    
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//定义一个数组
		//int [] arr;
		//初始化大小
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

package com.itstar.wqc01;

public class StringDemo01 {
	public static void main(String[] args) {
		
String parent="asdfghitstarijklqwitstarertyuioitstaraitstaraa**bbitstarb**ccc";
		
		String child="itstar";
		int count=getChildStringCount(parent,child);
		
		System.out.println("itstar 在父串中出现的次数为"+count);
		
		 count=matchStringBtSplit(parent,child);
		 
		 System.out.println("itstar 在父串中出现的次数为"+count);
		
	}
	public static int getChildStringCount(String parent,String child){
		//用来记录字符串出现的次数
		int count=0;
		/*indexof 循环遍历子字符串出现的字数 需要截取substring
		 * */
		//第一次 子字符串出现的索引
		int index=0;
		//优化前
//		while(true){
//		index=parent.indexOf(child);
//		//如果K的值不存在  ，侧返回-1
//		if(index!=-1){
//			//代表我们找到了 子字符串 进行加1
//			count++;
//		}else{
//			//当返回-1时  循环终止
//			break;
//		}
//		//更新我们的父字符串 从index+子串长度的位置开始截取
//		parent=parent.substring(index+child.length());
//		
//		
//		
//		
//	}//优化后
		while((index=parent.indexOf(child))!=-1){
			System.out.println(index);
			count++;
			parent=parent.substring(index+child.length());
		}
		
		return count;
	
	}
		public static int matchStringBtSplit(String parent,String child){
			int count=0;
			//首先获得根据child spilt 之后的字符串数组
			String[] results=parent.split(child);
			//贩毒案一下 最后一个字符串  是否是 我们要匹配的字符串
			String last=parent.substring(parent.length()-child.length());
			if(last.equals(child)){
				//返回的字符串数组长度 应为 原来长度
				count=results.length;
			}else{
				count=results.length-1;
			}
			
			
		return 	count;
		}
	
	
  } 	/*
   		*方法2通过split方法实现 次数统计
   		*regex:child String 子字符串
   		*让父字符串根据子串去分割  根据得到的String数组大小  类得到字符数量
   		*如果是子串在最后一个  则 返回的字符串数组长度 应为 原来长度
   		*否则  返回 字符串数组长度-1
   		*/
		

package com.itstar.wqc02;
/**
 * 查找父字符串中某一个字符串出现的次数
 * @author WQC
 *
 */
public class StringDemo02 {
	public static void main(String[] args) {
		
		String parent="asdfghitstarijklqwitstarertyuioitstaraitstaraa**bbitstarb**ccc";
		
		String child="itstar";
		int count=getChildStringCount(parent,child);
		
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
}

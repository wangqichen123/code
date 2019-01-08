package com.itstar.demo02;
/**
 * 声明一个life接口
 * 
 * @author WQC
 *
 */
public interface Life {
	
	//成员变量  不建议写
	//默认为public static 必须得初始化
	public static	final	int a=10;
	
	
	//默认为方法，下面可写可不写
	/*public abstract*/ void breath();
	public abstract void death();
	//1.8 新增了 static 方法和default 方法
	default /*static*/void test(){
		
	}
	
	
}

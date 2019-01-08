package com.itstar.demo04;

public class StaticFinalTest {
public static void main(String[] args) {
	
	for(int i=0;i<10;i++){
		
		TestClass ts=new TestClass();
		//System.out.println("final i="ts.i+"static j"+ts.j+"static final k"+ts.k);
		
	}
	
}
}
/*
 * final:用来表示变量不可变
 * 被static 修饰之后 只有一个值
 * final 有多个值 因为每次都会赋予一个值 只是保证赋值的这个值不变
 * 
 */
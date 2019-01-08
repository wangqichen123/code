package com.itser.wqc03;
/**
 * ¶àÌ¬--Ã¨ ¼Ì³Ğanimal
 * @author WQC
 *
 */
public class Cat extends Animal{
	
	public Cat(String name){
		super.setName(name);
	}
	//ÖØĞ´µÄ·½·¨
	public void eat(){
		System.out.println(super.getName()+"Ï²»¶³ÔÓã");
	}
	public void climbTree(){
		System.out.println("Ã¨»áÅÀÊ÷");
	}
}

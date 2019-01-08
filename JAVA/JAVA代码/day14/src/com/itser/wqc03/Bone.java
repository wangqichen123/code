package com.itser.wqc03;
/**
 * 多他爱--食物的子类  骨头
 * @author WQC
 *
 */
public class Bone extends Food{
	
	public Bone(String name){
		super(name);
	}
	//重写showName
	public void showName(){
		System.out.println("食物是骨头");
	}
}

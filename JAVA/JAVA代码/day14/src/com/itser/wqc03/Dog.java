package com.itser.wqc03;
/**
 * 多态--dog作为animal子类
 * @author WQC
 *
 */
public class Dog extends Animal{
	
	public Dog(String name){
		//super 调用父类的 非私有  的属性和方法
		super.setName(name);
	}
	//重写的方法  
   public void eat(){
	   
	   System.out.println(super.getName()+"喜欢吃骨头");
   }
}

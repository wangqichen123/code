package com.itser.wqc03;
/**
 * ��̬--è �̳�animal
 * @author WQC
 *
 */
public class Cat extends Animal{
	
	public Cat(String name){
		super.setName(name);
	}
	//��д�ķ���
	public void eat(){
		System.out.println(super.getName()+"ϲ������");
	}
	public void climbTree(){
		System.out.println("è������");
	}
}

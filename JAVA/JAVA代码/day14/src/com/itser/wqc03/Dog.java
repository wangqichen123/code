package com.itser.wqc03;
/**
 * ��̬--dog��Ϊanimal����
 * @author WQC
 *
 */
public class Dog extends Animal{
	
	public Dog(String name){
		//super ���ø���� ��˽��  �����Ժͷ���
		super.setName(name);
	}
	//��д�ķ���  
   public void eat(){
	   
	   System.out.println(super.getName()+"ϲ���Թ�ͷ");
   }
}

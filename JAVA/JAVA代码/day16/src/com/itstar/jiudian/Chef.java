package com.itstar.jiudian;
/**
 * ��ʦ��  �̳�Ա����  ʵ��VIP�ӿ�
 * @author WQC
 *
 */
public class Chef extends Employee implements VIP{

	public Chef(){
		
		super();
	}
	
	public Chef(String name,int age,String id){
		
		super(name,age,id);
	}
	
	
	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("��ʦ�ڸ�VIP�ṩ���µĲ�Ʒ");
	}
	
	public void work(){
		
		System.out.println("��ʦ��������");
	}
	
	
}

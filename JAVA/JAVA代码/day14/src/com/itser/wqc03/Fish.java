package com.itser.wqc03;
/**
 * ��̬--ʳ�������  ��
 * @author WQC
 *
 */
public class Fish extends Food{

	public Fish(String name) {
		super(name);
		
	}

	private String type;
	
	public void shwoName(){
		System.out.println("ʳ���");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}

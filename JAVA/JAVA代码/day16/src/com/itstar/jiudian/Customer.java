package com.itstar.jiudian;
/**
 * �˿���--������Է�
 * @author WQC
 *
 */
public class Customer {

	private String name;//�˿͵�����
	private String phoneNum;//�˿͵��ֻ���
	private String type;//�˿͵�����
	
	public Customer(){
		
		super();
	}
	
	public Customer(String name,String phoneNum,String type){
		
		this.name=name;
		this.phoneNum=phoneNum;
		this.type=type;
		
	}
	
	public void show(){
		
		System.out.println("����Ա"+name+"�������");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}

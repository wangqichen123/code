package com.itstar.jiudian;

public class Manager extends Employee {
	private double money;
	
	public Manager(){
		
		super();
	}
	
	public Manager(String name,int age,String id){
		
		super(name,age,id);
		
	}
	
	//��дһ��work����
	public void work(){
		
		System.out.println("�������ڹ���Ƶ� ");
		
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	

}

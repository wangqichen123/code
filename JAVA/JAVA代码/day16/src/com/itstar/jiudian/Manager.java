package com.itstar.jiudian;

public class Manager extends Employee {
	private double money;
	
	public Manager(){
		
		super();
	}
	
	public Manager(String name,int age,String id){
		
		super(name,age,id);
		
	}
	
	//重写一个work方法
	public void work(){
		
		System.out.println("经理正在管理酒店 ");
		
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	

}

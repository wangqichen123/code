package com.itstar.jiudian;
/**
 * 菜单类  记录菜品
 * @author WQC
 *
 */
public class MenuList {
	
	private String name;//菜的名字
	private double price;//菜的价格
	
	public MenuList(){
		
		
	}
	
	public MenuList(String name,double price){
		
		this.name=name;
		this.price=price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

package com.itstar.jiudian;
/**
 * �˵���  ��¼��Ʒ
 * @author WQC
 *
 */
public class MenuList {
	
	private String name;//�˵�����
	private double price;//�˵ļ۸�
	
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

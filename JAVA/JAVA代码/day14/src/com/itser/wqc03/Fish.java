package com.itser.wqc03;
/**
 * 多态--食物的子类  鱼
 * @author WQC
 *
 */
public class Fish extends Food{

	public Fish(String name) {
		super(name);
		
	}

	private String type;
	
	public void shwoName(){
		System.out.println("食物：鱼");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}

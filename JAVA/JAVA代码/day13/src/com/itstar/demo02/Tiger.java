package com.itstar.demo02;
/**
 * 实现 Animal 和 life接口
 * @author WQC
 * 把所有接口中未实现的抽象方法   全都实现了
 *
 */
public class Tiger implements Animal,Life{

	public String roar;
	
	//构造函数
	public Tiger(String roar){
		this.roar=roar;
		System.out.println(roar);
	}
	
	
	@Override
	public void breath() {
		
		System.out.println("Tiger is breath");
	}

	@Override
	public void death() {
		
		System.out.println("Tiger is going to die..");
	}
	//上面两个接口来自于life 
	@Override
	public void eat() {
		
		System.out.println("Tiger is eating....");
	}

	@Override
	public void jump() {
		
		System.out.println("Tiger is jump");
	}
	
	//上面两个接口来自于Animal
}

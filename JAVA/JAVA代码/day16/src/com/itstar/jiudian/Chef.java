package com.itstar.jiudian;
/**
 * 厨师类  继承员工类  实现VIP接口
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
		System.out.println("厨师在给VIP提供精致的菜品");
	}
	
	public void work(){
		
		System.out.println("厨师正在做菜");
	}
	
	
}

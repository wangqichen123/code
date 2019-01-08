package com.itstar.jiudian;
/**
 * 员工中的服务员类
 * @author WQC
 *
 */
public class Waiter extends Employee implements VIP {

	private String serviceRegion;//员工服务区域
	
	public Waiter(){
		
		super();
	}
	public Waiter(String name,int age,String id,String serviceRegion){
	
		super(name,age,id);
		this.serviceRegion=serviceRegion;	
	}
	public void work(){
		System.out.println("服务员正在上菜");
	}
	
	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("服务员在为vip上菜");
	}
	public String getServiceRegion() {
		return serviceRegion;
	}
	public void setServiceRegion(String serviceRegion) {
		this.serviceRegion = serviceRegion;
	}
	

}

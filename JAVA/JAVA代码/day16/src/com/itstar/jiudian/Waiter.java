package com.itstar.jiudian;
/**
 * Ա���еķ���Ա��
 * @author WQC
 *
 */
public class Waiter extends Employee implements VIP {

	private String serviceRegion;//Ա����������
	
	public Waiter(){
		
		super();
	}
	public Waiter(String name,int age,String id,String serviceRegion){
	
		super(name,age,id);
		this.serviceRegion=serviceRegion;	
	}
	public void work(){
		System.out.println("����Ա�����ϲ�");
	}
	
	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("����Ա��Ϊvip�ϲ�");
	}
	public String getServiceRegion() {
		return serviceRegion;
	}
	public void setServiceRegion(String serviceRegion) {
		this.serviceRegion = serviceRegion;
	}
	

}

package com.itestr.demo05;
// ��ʦ��
/**
 * toString ����д
 * @author WQC
 *
 */
public class Teacher {
	private int workYear ;
	private String name;
	
	//���캯��
	public Teacher(String name,int workYear){
		this.name=name;
		this.workYear=workYear;
	}
	public String toString(){
		System.out.println("��д֮ǰ��toString");
		super.toString();
		return "["+this.name+","+this.workYear+"]";
	}
	
}

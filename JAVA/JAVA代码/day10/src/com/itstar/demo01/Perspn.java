package com.itstar.demo01;
/*
 * ����һ������
 */
public class Perspn {
  
	//����
	public String name;
	//�Ա�
	char sex;
	//����
	int age;
	
	/*��Ա����*/
	public void eat(){
		System.out.println(name+"�ڳԷ�");
	}
	 public void drink(){
		 System.out.println(name+"�ں�����");
	 }
	public void buy(Drinks drink){
		System.out.println(name+"����һƿ"+drink.name+"����"+drink.price);
	}
}

package com.itwqc_05;
/*
 * private�ؼ���
 * private:
 * ��һ�����η�
 * �������γ�Ա������Ҳ�������γ�Ա����
 * ��private���ε�ֻ���ڱ����б�����
 * ���private���εı��������ǻ���Ӧ���ṩgetXxx()
 * ��SetXxx()���ڻ�ȡ��Ա������ֵ��������public����
 * 
 * 
 */
public class Student {
	String name;
	
	
	//int age;
	
	private int age;
	
	public void setAge(int a){
		if(a<0||a>200){
			System.out.println("�������������");
		}else{
		age=a;
		}
	}
	public int getAge(){
		return age;
	}
	public void show(){
		System.out.println("������"+name+"������"+age);
	}

}

package com.itster.demo01;
/**
 * ��ӡ���ĳ�����
 * @author WQC
 *	�������в�һ�����г��󷽷�
 */

public abstract class Printer {
	//��Ա���� ����
	private String name;
	private String type;
	
	public Printer(){
		
	}
	//����һ�����󷽷�--��ӡ
	public abstract void print();//{
	
	public abstract void check();
	//���󷽷������з�����}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

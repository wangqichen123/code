package com.itwqc_02;
/*
 * �ֻ���Ĳ�����
 * 
 * 
 */
public class PhoneDemo {
    public static void main(String[] args){
    	//��������
    	Phone p=new Phone();
    	
    	//�����Ա����ֵ
    	System.out.println("Ʒ��"+p.brand);
    	System.out.println("�۸�"+p.price);
    	System.out.println("��ɫ"+p.color);
    	System.out.println("_______");
    	//����Ա������ֵ
    	p.brand="ƻ��";
    	p.price=200;
    	p.color="��ɫ";
    	System.out.println("Ʒ��"+p.brand);
    	System.out.println("�۸�"+p.price);
    	System.out.println("��ɫ"+p.color);
    	
    	//���ó�Ա����
    	p.call("wqc"); 
    	p.sendMessage();
    	}
}

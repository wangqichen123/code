package com.itstar.demo02;

public class InterfaceTest {
public static void main(String[] args) {
	//�ӿڲ��ܱ�ʵ����
	//Animal animal=new Animal����;
	Tiger tiger=new Tiger("��Х");
	//name a �� public static final tigerʵ�� ����ֱ��ʹ��
	System.out.println(tiger.name+"..."+tiger.a);
	
	tiger.breath();
	tiger.eat();
	tiger.jump();
	tiger.death();
}
}

package com.itser.wqc03;
/**
 * 
 * @author WQC
 *
 */
public class PolyFeedTest02 {
	public static void main(String[] args) {
		
		Animal animal=new Cat("��ķ");
		//����ת��֮���޷������������еķ���
		//animal.climbTree();
		animal.cry();
//		Cat cat=new Cat("С��");
//		cat.climbTree();
		//���ͨ��animal ��������ķ����أ�
		Cat cat=(Cat) animal;
		cat.climbTree(); 
		// instanceof 
		//�Ա�--��������ʱ�����   java.lang.ClassCastException
		//��̬  ��̬��
		/*Animal animal2=new Animal();
		Cat cat2=(Cat) animal2;
		cat2.climbTree();*/
	}
}

package com.itwqc_02;
/*
 * Student��һ��ѧ�����������࣬main �������ʺϷ���������
 * 
 * ʹ��һ���࣬��ʵ����ʹ�ø���ĳ�Ա����Ա�����ͳ�Ա������
 * ��Ҫʹ��һ����ĳ�Ա���ͱ�������ӵ�и���Ķ���
 * ������δ���һ������
 * 
 * ��ʽ������ ������=new ����������
 * 
 * ������η��ʳ�Ա�أ�
 * 		��Ա��������������������
 * 		��Ա����������������������������
 */
public class StudentDemo {
	public static void main(String[] args){
		//��ʽ������ ������=new ����();
		Student s=new Student();
		//System.out.println("s:"+s);
		System.out.println("������"+s.name);
		System.out.println("���䣺"+s.age);
		System.out.println("-----------");
		s.name="wqc";
		s.age=22;
		//��ֵ���ٴ����
		System.out.println("������"+s.name);
		System.out.println("���䣺"+s.age);
		
		
		//���ó�Ա����
		s.study();
		s.eat();
	}
}

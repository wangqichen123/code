package com.itstar.wqc01;
/**
 * ���ռ̳г����� ��ʵ�ֳ����෽������д  Ӧ�ö�̬
 * @author WQC
 * �����ڲ��൱�в��ܹ��о�̬��Ա�;�̬����
 */
public class ChildTest {
	public static void main(String[] args) {
		
		//��̬   ����Ӧ��ָ������Ķ���
		//��ͳ��ʽ  ͨ������һ���µ���  �̳�   ��д
		Person p=new Child();
		p.eat();
		
		/*�����ڲ���  ʵ�ַ�������д*/
		//ֱ��ʵ��һ�������� ����
		//Person p2=new Person();
		Person p2 =new Person(){//�����ڲ���
			//����һ������
			private int a=666;
			//�����ڲ��಻����static ��Ա  ����
			//private static int b=22;
			@Override
			public void eat(){
				System.out.println("����2 �����ڲ���ķ�ʽ:��ţ��");
			}
			
			public void show(){
				
				System.out.println("hello world");
			}
			
			//�����ڲ�����$����
			
		};//һ��Ҫע������ֺ�
		
		p2.eat();
		//�����ڲ����޷�ֱ�ӵ�����������Ժͷ���   ����  ��д֮���
		System.out.println(p.getClass());
		
	}
}

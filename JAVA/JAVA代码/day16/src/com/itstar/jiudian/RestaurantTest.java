package com.itstar.jiudian;
/**
 * ����Ĳ�����
 * @author WQC
 *
 */
public class RestaurantTest {
	
	public static void main(String[] args) {
		//1  ��ʼ��
		
		Manager m1=new Manager("����",33,"m001");
		Waiter w1=new Waiter("����",22,"w001","A");
		Waiter w2=new Waiter("����",23,"002","B");
		Chef chef=new Chef("ˮ��ʦ��",25,"c001");
		
		//�˿�
		Customer c=new Customer("����","666666","VIP");
		Customer c2=new Customer("���ڵ�","233333","��ͨ");
		//2  ��ʼ���˵�
		
		MenuList menuList1=new MenuList("ˮ������",998);
		MenuList menuList2=new MenuList("С����",98);
		 
		
		//3 ��ʼ����
		
		m1.work();
		c.show();
		
		System.out.println("***********������********");
		System.out.println("***********1 ˮ������  998*******");
		System.out.println("***********2 С���� 98*******");
		//���д�� ����������ж�
		if(c.getType()=="VIP"){
			w1.work();
			w1.service();
			chef.work();
			chef.service();
		}else{
			w1.work();
			
			chef.work();
		}
		
		
	}
	
}

package com.itstar.jiudian;
/**
 * 饭店的测试类
 * @author WQC
 *
 */
public class RestaurantTest {
	
	public static void main(String[] args) {
		//1  初始化
		
		Manager m1=new Manager("经理",33,"m001");
		Waiter w1=new Waiter("王仔",22,"w001","A");
		Waiter w2=new Waiter("桃子",23,"002","B");
		Chef chef=new Chef("水货师傅",25,"c001");
		
		//顾客
		Customer c=new Customer("王总","666666","VIP");
		Customer c2=new Customer("王第第","233333","普通");
		//2  初始化菜单
		
		MenuList menuList1=new MenuList("水货炒饭",998);
		MenuList menuList2=new MenuList("小炒饭",98);
		 
		
		//3 开始运行
		
		m1.work();
		c.show();
		
		System.out.println("***********报菜名********");
		System.out.println("***********1 水货炒饭  998*******");
		System.out.println("***********2 小炒饭 98*******");
		//最好写在 类里面进行判断
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

package com.itstar.wqc01;
/**
 * 按照继承抽象类 ，实现抽象类方法的重写  应用多态
 * @author WQC
 * 匿名内部类当中不能够有静态成员和静态方法
 */
public class ChildTest {
	public static void main(String[] args) {
		
		//多态   父类应用指向子类的对象
		//传统方式  通过声明一个新的类  继承   重写
		Person p=new Child();
		p.eat();
		
		/*匿名内部类  实现方法的重写*/
		//直接实名一个抽象类 不行
		//Person p2=new Person();
		Person p2 =new Person(){//匿名内部类
			//定义一个属性
			private int a=666;
			//匿名内部类不允许static 成员  方法
			//private static int b=22;
			@Override
			public void eat(){
				System.out.println("方法2 匿名内部类的方式:喝牛奶");
			}
			
			public void show(){
				
				System.out.println("hello world");
			}
			
			//匿名内部类有$符号
			
		};//一定要注意这个分号
		
		p2.eat();
		//匿名内部类无法直接调用里面的属性和方法   除了  重写之外的
		System.out.println(p.getClass());
		
	}
}

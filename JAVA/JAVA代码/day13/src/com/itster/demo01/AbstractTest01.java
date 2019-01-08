package com.itster.demo01;
/**
 * 测试抽象类
 * @author WQC
 *	声明的格式 ：
 *  abstract class 类名 {}---抽象类
 *  
 *  如果一个类继承抽象类，则必须完全实现其抽象方法，否则声明为抽象类
 *  抽象方法必须用 public 或   protected 修饰
 *  不能狗被 private 或 static 修饰
 */
public class AbstractTest01 {
	public static void main(String[] args) {
		//抽象类不能够进行实例化 不能够创建对象
		
		//Printer p=new Printer();
		//抽象类 通过子类进行实例化 
		Printer printer =new HPprinter();
		//继承抽象类的类  可否进行实例化
		HPprinter hp=new HPprinter();
		Cannonprinter canno=new Cannonprinter();
		
		hp.print();
		hp.check();
		
		canno.check();
		canno.print();
		
	}
}

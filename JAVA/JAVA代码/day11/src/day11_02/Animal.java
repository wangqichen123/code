package day11_02;
/*
 * 静态构造代码块测试
 * 构造代码块可以执行多次，在创建对象的时候使用
 * 优先级: 先是静态构造代码块 >构造代码块> 构造函数
 * 
 */
public class Animal {
	//动物的成员变量  封装  private
	private String name;
	public char sex;
	//用static 修饰的成员变量
	private static String move="会动";
	public static double weight=200.0;
	static{
		int age=10;
		System.out.println("静态构造代码块");
	}
	
	
	
	//生成无参构造函数
	public Animal(){
		
	}
	//定义一个静态方法
	public static void cry(){
		//静态方法不能够使用非静态的变量
		//System.out.println(name+"is crying");
		System.out.println(move);
	}
	//定义一个非静态方法
	public void crry(){
		//非静态方法可以随便使用静态的变量
		System.out.println(name);
	}
}

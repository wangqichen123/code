package day11;
/*
 * static 
 * （1）主要用来修饰类的成员（成员变量。方法）
 * 		main 函数 static 修饰
 * （2）static 特点
 * static 修饰的成员在类加载时直接运行，优先级较高
 * 通过类名直接访问 类名.成员
 * 	(3) static 是针对所有对象的属性值相同时才使用
 * static 修饰
 *  (4)静态代码块
 *  为了方便变量的初始化
 * 
 */
public class Animal {
	//动物的成员变量  封装  private
	private String name;
	public char sex;
	//用static 修饰的成员变量
	private static String move="会动";
	public static double weight=200.0;
	
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

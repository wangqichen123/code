package com.itstar.wqc01;
/**
 * 成员内部类演示
 * @author WQC
 *
 */
public class Circle {
	//成员变量
	private double radius=1;
	private static final double PI=3.14;
	class Draw{
		//成员内部类-- 成员变量
		private String type;
		private /*static*/ int a=10;//成员内部类不能生成静态的
		private double radius=2;
		//成员内部类的构造方法
		public Draw(String type){
			this.type=type;
		}
		//成员内部类的普通方法
		public void DrawShape(){
			System.out.println("外部类的private成员变量"+Circle.this.radius);
			System.out.println("内部类的"+radius);
			
			//成员内部类可以访问外部类方法
			showRadius();
			System.out.println("内部类--Drawsh");
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}
		
	}
	//构造函数
	public Circle(){
			
	}
	
	//外部类普通的函数
	
	//外部类 访问内部类的成员或属性
	public Draw getDrawInstance(){
		
		return new Draw(null);
	}
	
	public void getDraw(){
		//1  实例化内部类对象
		Draw draw1=getDrawInstance();
		System.out.println("内部类的成员变量"+draw1.a); 
		System.out.println("调用内部类的方法");
		draw1.DrawShape();
	}
	
	public void showRadius(){
		System.out.println("半径是"+this.radius);
	}
	
	public Circle(double radius){
		
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static double getPi() {
		return PI;
	}
	
}

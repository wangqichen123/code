package com.itstar.wqc01;
/**
 * 测试在test类中 初始化 外部类和成员内部类
 * @author WQC
 *
 */
public class InnerTest {
		public static void main(String[] args) {
			
			//方法1 初始化一个外部类对象
			Circle circle=new Circle(1.2);
			//方法1 --2在外部类对象初始化基础之上
			/* 
			 * Outter.Inner inner=outter.new Inner();
			 * 
			 */
					
			Circle.Draw draw=circle.new Draw("画圆");
			draw.DrawShape();
			
			//方法2 通过外部类的方法来调用内部类
			
			Circle.Draw draw2=circle.getDrawInstance();
			draw2.DrawShape();
		}
}

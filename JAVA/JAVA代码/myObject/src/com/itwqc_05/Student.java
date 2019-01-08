package com.itwqc_05;
/*
 * private关键字
 * private:
 * 是一个修饰符
 * 可以修饰成员变量。也可以修饰成员方法
 * 被private修饰的只能在本类中被访问
 * 针对private修饰的变量，我们会相应的提供getXxx()
 * 和SetXxx()用于获取成员变量的值，方法用public修饰
 * 
 * 
 */
public class Student {
	String name;
	
	
	//int age;
	
	private int age;
	
	public void setAge(int a){
		if(a<0||a>200){
			System.out.println("输出的年龄有误");
		}else{
		age=a;
		}
	}
	public int getAge(){
		return age;
	}
	public void show(){
		System.out.println("姓名是"+name+"年龄是"+age);
	}

}

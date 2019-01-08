package com.itstar.demo02;

public class InterfaceTest {
public static void main(String[] args) {
	//接口不能被实例化
	//Animal animal=new Animal（）;
	Tiger tiger=new Tiger("虎啸");
	//name a 是 public static final tiger实现 可以直接使用
	System.out.println(tiger.name+"..."+tiger.a);
	
	tiger.breath();
	tiger.eat();
	tiger.jump();
	tiger.death();
}
}

package com.replay;

public class InterFaceDemo {
	public static void main(String[] args) {
//		Dog d=new Dog("����");
//		d.eat();
//		d.run();
//		d.sex();
		Animal animal=new Dog("��ë");
		animal.sex();
		
		Action action=new Dog("����");
		action.eat();
	}
}

 abstract class Animal{
	private String name;
	
	abstract public void sex();
	
}

class Dog extends Animal implements Action{
		
	private String name;
	@Override
	public void eat() {
		System.out.println("���Թ�ͷ");
		
	}

	@Override
	public void run() {
		System.out.println("��");
		
	}

	@Override
	public void sex() {
		System.out.println("sex");
		
	}
	Dog(String name){
		this.name=name;
	}
	
}

class cat extends Animal implements Action{

	@Override
	public void sex() {
		System.out.println("sex cat");
		
	}

	@Override
	public void eat() {
		
		
	}

	@Override
	public void run() {
		
		
	}
	
}

interface Action{
	public abstract void eat();
	public abstract void run();
	
}
package com.itstar.demo03;
/**
 * 声明一个final 类
 * @author WQC
 *final 修饰的方法也不能被重写
 *final 修饰变量，如果这个值一旦被指定 则无法改变
 *final class 可以被使用但不能被继承
 */

public  class Computer {
	//成员变量
	private String cpu;
	private String memory;
	private String sorage;
	
	//方法
	public Computer(){
		
	}
	//普通方法
	public void open(){
		System.out.println("欢迎大家使用TZ牌计算机");
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getSorage() {
		return sorage;
	}
	public void setSorage(String sorage) {
		this.sorage = sorage;
	}
	
}

package com.itstar.demo02;
/**
 * 声明一个接口 Animal
 * @author WQC
 *
 */
public interface Animal {
	//默认 static final
	String name="动物";
		
	/*接口里面不能有构造函数   构造函数有方法体*/
//	public Animal(){
//		
//	}
	void eat();
	void jump();
	void death();
	
}

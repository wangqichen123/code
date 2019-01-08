package com.itser.wqc03;
/**
 * 
 * @author WQC
 *
 */
public class PolyFeedTest02 {
	public static void main(String[] args) {
		
		Animal animal=new Cat("汤姆");
		//向上转型之后无法调用子类特有的方法
		//animal.climbTree();
		animal.cry();
//		Cat cat=new Cat("小黑");
//		cat.climbTree();
		//如何通过animal 调用子类的方法呢？
		Cat cat=(Cat) animal;
		cat.climbTree(); 
		// instanceof 
		//对比--下面运行时会出错   java.lang.ClassCastException
		//多态  动态绑定
		/*Animal animal2=new Animal();
		Cat cat2=(Cat) animal2;
		cat2.climbTree();*/
	}
}

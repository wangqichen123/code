package com.itser.wqc03;
/**
 * 通过多态实现 动物的动态喂食
 * @author WQC
 *
 */
public class PolyFeedTest {
	public static void main(String[] args) {
		
		//实例化一个饲养员
		Person p=new Person("王",22);
		
		//动态喂食
		Animal animal1=new Dog("乐");
		Food food1=new Bone("骨");
		p.feed(animal1, food1);
		
		Animal animal2=new Cat("rom");
		Food food2=new Fish("黄鱼");
		p.feed(animal2, food2);
		
		
		p.feed(new Dog("乐乐"), new Bone("骨头"));
		p.feed(new Cat("tom"), new Fish("三文鱼"));
		
	}
}

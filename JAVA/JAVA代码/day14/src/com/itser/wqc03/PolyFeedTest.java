package com.itser.wqc03;
/**
 * ͨ����̬ʵ�� ����Ķ�̬ιʳ
 * @author WQC
 *
 */
public class PolyFeedTest {
	public static void main(String[] args) {
		
		//ʵ����һ������Ա
		Person p=new Person("��",22);
		
		//��̬ιʳ
		Animal animal1=new Dog("��");
		Food food1=new Bone("��");
		p.feed(animal1, food1);
		
		Animal animal2=new Cat("rom");
		Food food2=new Fish("����");
		p.feed(animal2, food2);
		
		
		p.feed(new Dog("����"), new Bone("��ͷ"));
		p.feed(new Cat("tom"), new Fish("������"));
		
	}
}

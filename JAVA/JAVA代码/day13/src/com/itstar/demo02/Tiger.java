package com.itstar.demo02;
/**
 * ʵ�� Animal �� life�ӿ�
 * @author WQC
 * �����нӿ���δʵ�ֵĳ��󷽷�   ȫ��ʵ����
 *
 */
public class Tiger implements Animal,Life{

	public String roar;
	
	//���캯��
	public Tiger(String roar){
		this.roar=roar;
		System.out.println(roar);
	}
	
	
	@Override
	public void breath() {
		
		System.out.println("Tiger is breath");
	}

	@Override
	public void death() {
		
		System.out.println("Tiger is going to die..");
	}
	//���������ӿ�������life 
	@Override
	public void eat() {
		
		System.out.println("Tiger is eating....");
	}

	@Override
	public void jump() {
		
		System.out.println("Tiger is jump");
	}
	
	//���������ӿ�������Animal
}

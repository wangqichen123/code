package com.itstar.demo02;
/**
 * ����һ��life�ӿ�
 * 
 * @author WQC
 *
 */
public interface Life {
	
	//��Ա����  ������д
	//Ĭ��Ϊpublic static ����ó�ʼ��
	public static	final	int a=10;
	
	
	//Ĭ��Ϊ�����������д�ɲ�д
	/*public abstract*/ void breath();
	public abstract void death();
	//1.8 ������ static ������default ����
	default /*static*/void test(){
		
	}
	
	
}

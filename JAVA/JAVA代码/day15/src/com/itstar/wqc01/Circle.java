package com.itstar.wqc01;
/**
 * ��Ա�ڲ�����ʾ
 * @author WQC
 *
 */
public class Circle {
	//��Ա����
	private double radius=1;
	private static final double PI=3.14;
	class Draw{
		//��Ա�ڲ���-- ��Ա����
		private String type;
		private /*static*/ int a=10;//��Ա�ڲ��಻�����ɾ�̬��
		private double radius=2;
		//��Ա�ڲ���Ĺ��췽��
		public Draw(String type){
			this.type=type;
		}
		//��Ա�ڲ������ͨ����
		public void DrawShape(){
			System.out.println("�ⲿ���private��Ա����"+Circle.this.radius);
			System.out.println("�ڲ����"+radius);
			
			//��Ա�ڲ�����Է����ⲿ�෽��
			showRadius();
			System.out.println("�ڲ���--Drawsh");
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}
		
	}
	//���캯��
	public Circle(){
			
	}
	
	//�ⲿ����ͨ�ĺ���
	
	//�ⲿ�� �����ڲ���ĳ�Ա������
	public Draw getDrawInstance(){
		
		return new Draw(null);
	}
	
	public void getDraw(){
		//1  ʵ�����ڲ������
		Draw draw1=getDrawInstance();
		System.out.println("�ڲ���ĳ�Ա����"+draw1.a); 
		System.out.println("�����ڲ���ķ���");
		draw1.DrawShape();
	}
	
	public void showRadius(){
		System.out.println("�뾶��"+this.radius);
	}
	
	public Circle(double radius){
		
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static double getPi() {
		return PI;
	}
	
}

package com.itstar.wqc01;
/**
 * ������test���� ��ʼ�� �ⲿ��ͳ�Ա�ڲ���
 * @author WQC
 *
 */
public class InnerTest {
		public static void main(String[] args) {
			
			//����1 ��ʼ��һ���ⲿ�����
			Circle circle=new Circle(1.2);
			//����1 --2���ⲿ������ʼ������֮��
			/* 
			 * Outter.Inner inner=outter.new Inner();
			 * 
			 */
					
			Circle.Draw draw=circle.new Draw("��Բ");
			draw.DrawShape();
			
			//����2 ͨ���ⲿ��ķ����������ڲ���
			
			Circle.Draw draw2=circle.getDrawInstance();
			draw2.DrawShape();
		}
}

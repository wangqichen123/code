package com.itstar.wqc01;
/**
 * String split
 * @author WQC
 *
 */
public class StringDemo02 {
	
	public static void main(String[] args) {
		
		String str="1000,2000,2000,3000,888";
		
		//������ �ַ���  ������Щ�ܺ�
	int	salary=salary(str, ",");
	System.out.println("��Щ�����ܺ�Ϊ");
		
	}
	/*
	 * ͨ��split���� ��� ����  ���зָ� 
	 * �ַ�������
	 * ����ת��  �ַ�ת��Ϊ����
	 * ValueOf ����  ���ַ���ת��Ϊ����
	 * ������
	 * */
	public static int salary(String str,String regex){
		int salary=0;
		//1  split �ַ���
		String[] resules=str.split("regex");
		//2  ���б���
		for(int i=0;i<resules.length;i++){
			
			//3 ����ת��
			int temp=Integer.valueOf(resules[i]);
			//4 ���
			salary+=temp;
		}
		
		
		return salary;
		
	}
}

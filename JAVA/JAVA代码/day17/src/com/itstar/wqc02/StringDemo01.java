package com.itstar.wqc02;
/**
 * ͳ�� ��д��ĸ Сд��ĸ  ���ֵĴ���
 * @author  WQC
 * @version 1.0
 */
public class StringDemo01{
	public static void main(String[] args){
		
		String s="ASDFQWERT123yuiopzxcbnm7890%@";
		getCount(s);
		
		
	}
	public static void getCount(String s){
		//��¼��Сд��ĸ ���ֳ��ִ���
		
		int upper=0;
		int lower=0;
		int digit=0;
		//for ѭ������   ���ַ�����ÿһ���ַ����бȶ�
		
		for(int i=0;i<s.length();i++){
			//����һ��char  �����洢����ÿ���ַ������ַ�
			char c=s.charAt(i);
			//ͨ�� AscII ��ֵ ���ж�  ����  48 ��д��ĸ 65 Сд��ĸ 97
			
			if(c>=48&&c<=57){
				
				digit++;
			}else if(c>='A'&&c<='Z'){
				
				upper++;
			}else if(c>='a'&&c<='z'){
				lower++;
			}
			
		}
			System.out.println("���ֵĸ���Ϊ:"+digit);
			System.out.println("��д��ĸ�ĸ���Ϊ:"+upper);
			System.out.println("Сд��ĸ�ĸ���Ϊ:"+lower);
			System.out.println("�ַ��ܳ���Ϊ"+s.length());
	}
	
}

package com.itstar.wqc02;
/**
 * ���Ҹ��ַ�����ĳһ���ַ������ֵĴ���
 * @author WQC
 *
 */
public class StringDemo02 {
	public static void main(String[] args) {
		
		String parent="asdfghitstarijklqwitstarertyuioitstaraitstaraa**bbitstarb**ccc";
		
		String child="itstar";
		int count=getChildStringCount(parent,child);
		
		System.out.println("itstar �ڸ����г��ֵĴ���Ϊ"+count);
	}
	public static int getChildStringCount(String parent,String child){
		//������¼�ַ������ֵĴ���
		int count=0;
		/*indexof ѭ���������ַ������ֵ����� ��Ҫ��ȡsubstring
		 * */
		//��һ�� ���ַ������ֵ�����
		int index=0;
		//�Ż�ǰ
//		while(true){
//		index=parent.indexOf(child);
//		//���K��ֵ������  ���෵��-1
//		if(index!=-1){
//			//���������ҵ��� ���ַ��� ���м�1
//			count++;
//		}else{
//			//������-1ʱ  ѭ����ֹ
//			break;
//		}
//		//�������ǵĸ��ַ��� ��index+�Ӵ����ȵ�λ�ÿ�ʼ��ȡ
//		parent=parent.substring(index+child.length());
//		
//		
//		
//		
//	}//�Ż���
		while((index=parent.indexOf(child))!=-1){
			System.out.println(index);
			count++;
			parent=parent.substring(index+child.length());
		}
		
		return count;
	
	}
}

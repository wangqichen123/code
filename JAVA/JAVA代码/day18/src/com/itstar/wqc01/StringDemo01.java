package com.itstar.wqc01;

public class StringDemo01 {
	public static void main(String[] args) {
		
String parent="asdfghitstarijklqwitstarertyuioitstaraitstaraa**bbitstarb**ccc";
		
		String child="itstar";
		int count=getChildStringCount(parent,child);
		
		System.out.println("itstar �ڸ����г��ֵĴ���Ϊ"+count);
		
		 count=matchStringBtSplit(parent,child);
		 
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
		public static int matchStringBtSplit(String parent,String child){
			int count=0;
			//���Ȼ�ø���child spilt ֮����ַ�������
			String[] results=parent.split(child);
			//������һ�� ���һ���ַ���  �Ƿ��� ����Ҫƥ����ַ���
			String last=parent.substring(parent.length()-child.length());
			if(last.equals(child)){
				//���ص��ַ������鳤�� ӦΪ ԭ������
				count=results.length;
			}else{
				count=results.length-1;
			}
			
			
		return 	count;
		}
	
	
  } 	/*
   		*����2ͨ��split����ʵ�� ����ͳ��
   		*regex:child String ���ַ���
   		*�ø��ַ��������Ӵ�ȥ�ָ�  ���ݵõ���String�����С  ��õ��ַ�����
   		*������Ӵ������һ��  �� ���ص��ַ������鳤�� ӦΪ ԭ������
   		*����  ���� �ַ������鳤��-1
   		*/
		

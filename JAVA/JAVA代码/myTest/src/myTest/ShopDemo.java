package myTest;

import java.util.Scanner;

public class ShopDemo {
	public static void main(String[] args) {
		//1 ѡ��ҳ��
		
		//2 ����ʼ��    Ʒ����  ���  �۸� ���� 
		//2-1 �̲��������Ϣ
		String GreenTee="�̲�";
		double GreenTeesize=500;
		double GreenTeeprice=5.0;
		int GreenTeecount=10;
		
		//2-2 ѩ��
		String sprite="ѩ��";
		double Sprintsize=500;
		double sprintprice=4.5;
		int SpriteCount=5;
		
		//2-3 ����
		String Cola="����";
		double ColaSize=300;
		double ColaPrice=2.5;
		int ColaCount=5;
		
		//3����
		while(true){//����ѡ��
			Scanner scan=new Scanner(System.in);
			int Choice=scan.nextInt();//�û�ѡ��
			if(Choice!=0){
				switch(Choice){
				case 1:
					System.out.println("----");
					System.out.println("Ʒ��      ���ml�� �۸�     ����");
					System.out.println(GreenTee+"	"+GreenTeesize+"	"+GreenTeeprice);
					System.out.println("----welcome!------");
					//�������
					System.out.println("����������");
					int count=scan.nextInt();
					//
					if(count>GreenTeecount){
						System.out.println("��治��");
						
					}else if(count<=0){
						System.out.println("���������Ǹ���");
					}else{
						System.out.println("��֧��"+(count*GreenTeeprice)+"Ԫ");
						System.out.println("���׳ɹ�");
						GreenTeecount-=count;
					}
					break;
				case 2:
					
					
					break;
				case 3:
					
					
					break;
					default:
						System.out.println("�������");
						break;
					
					
				}
			}else{
				//��������Ϊ0,ֱ���˳�
				break;
			}
			
			
		}
		
		
	}
}

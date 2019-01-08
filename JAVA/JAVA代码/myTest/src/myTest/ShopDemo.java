package myTest;

import java.util.Scanner;

public class ShopDemo {
	public static void main(String[] args) {
		//1 选购页面
		
		//2 库存初始化    品牌名  规格  价格 数量 
		//2-1 绿茶基本的信息
		String GreenTee="绿茶";
		double GreenTeesize=500;
		double GreenTeeprice=5.0;
		int GreenTeecount=10;
		
		//2-2 雪碧
		String sprite="雪碧";
		double Sprintsize=500;
		double sprintprice=4.5;
		int SpriteCount=5;
		
		//2-3 可乐
		String Cola="可乐";
		double ColaSize=300;
		double ColaPrice=2.5;
		int ColaCount=5;
		
		//3销售
		while(true){//多重选择
			Scanner scan=new Scanner(System.in);
			int Choice=scan.nextInt();//用户选择
			if(Choice!=0){
				switch(Choice){
				case 1:
					System.out.println("----");
					System.out.println("品牌      规格（ml） 价格     数量");
					System.out.println(GreenTee+"	"+GreenTeesize+"	"+GreenTeeprice);
					System.out.println("----welcome!------");
					//买的数量
					System.out.println("请输入数量");
					int count=scan.nextInt();
					//
					if(count>GreenTeecount){
						System.out.println("库存不够");
						
					}else if(count<=0){
						System.out.println("数量不能是负数");
					}else{
						System.out.println("请支付"+(count*GreenTeeprice)+"元");
						System.out.println("交易成功");
						GreenTeecount-=count;
					}
					break;
				case 2:
					
					
					break;
				case 3:
					
					
					break;
					default:
						System.out.println("输入错误");
						break;
					
					
				}
			}else{
				//键盘输入为0,直接退出
				break;
			}
			
			
		}
		
		
	}
}

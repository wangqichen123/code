package com.itstar.wqc01;
/**
 * ͬ�������
 * ͬ������
 * ��
 * @author WQC
 *
 */
public class Ticket implements Runnable{

	//Ʈ������
	private int total;
	
	//�޲ι��캯��
	Ticket(){
			
	}
	//���ι��캯��
	Ticket(int total){
		this.total=total;
	}
	
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(total>0){
			//����һ��Ʊ
			total--;
			//��ӡ���Ǹ���������Ʊ
			String window=Thread.currentThread().getName();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(window+"����һ��Ʊ"+"��ʣ"+total+"Ʊ");
		}
		
	}
	
	
}

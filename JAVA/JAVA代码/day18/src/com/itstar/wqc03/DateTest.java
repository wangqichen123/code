package com.itstar.wqc03;
/**
 * 
 * @author WQC
 *
 */
import java.util.Date;
public class DateTest {
	public static void main(String[] args) {
		
		//�Ժ������  Ϊ��λ��    ������� 1970�� 0�� 0��   0��
		Date date=new Date(0);//ʱ��ԭ��
		System.out.println(date);
		//��ǰʱ��
		Date now=new Date();
		System.out.println(now.getTime());
		
	}
}

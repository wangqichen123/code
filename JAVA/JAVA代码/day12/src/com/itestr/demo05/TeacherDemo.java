package com.itestr.demo05;

public class TeacherDemo {
	public static void main(String[] args) {
		
		Teacher tc=new Teacher("wqc",3);
		Teacher teac=new Teacher("wqc",3);
		//�Դ���equal �ķ��� �Ƚϵ��ǵ�ַ 
		//ÿ�������ж����Ĵ洢�ռ�
		System.out.println(tc.equals(teac));
		
	}
}

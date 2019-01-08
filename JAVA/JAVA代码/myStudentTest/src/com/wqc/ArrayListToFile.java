package com.wqc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 *
 * ������
 * 		A:����ѧ����
 * 		B:�������϶���
 * 		C:д����ʵ�ּ���¼��ѧ����Ϣ������ѧ��������ΪԪ����ӵ�����
 * 		D:�����������������
 * 		E:��������,�õ�ÿһ��ѧ����Ϣ������ѧ����Ϣ����һ���ĸ�ʽд���ı��ļ�
 * 			������001,wqc,30,����
 * 		F:�ͷ���Դ

 * @author WQC
 *
 */
public class ArrayListToFile {
public static void main(String[] args) throws IOException {
	//�������϶���
	ArrayList<Student> array=new ArrayList<Student>();
	
	//д����ʵ�ּ���¼��ѧ����Ϣ,����ѧ��������ΪԪ����ӵ�����
	addStudent(array);
	addStudent(array);
	addStudent(array);
	
	//�����������������
	BufferedWriter bw=new BufferedWriter(new FileWriter("array.txt"));
	//��������    �õ�ÿһ��ѧ����Ϣ��������Ϣ����һ����ʽд���ļ�
	for(int x=0;x<array.size();x++){
		Student s=array.get(x);
		StringBuilder sb=new StringBuilder();
		sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
		
		bw.write(sb.toString());
		bw.newLine();
		bw.flush();
	}
	bw.close();
}
	//���ѧ��
		public static void addStudent(ArrayList<Student> array){
			//��������¼�����
			Scanner sc=new Scanner(System.in);
			
			
			//Ϊ����id ��������ʵ�����ѭ���ⴴ��id
			String id; 
			while(true){// Ϊ���ô���ص����ʹ��ѭ��
			System.out.println("������ѧ��ѧ��");
			 id =sc.nextLine();
			//��Ϊ���ܻ�������ѧ��һ�������
			//����ʵ��������ܳ���ѧ����ͬ�����������
			//����һ�����
			boolean flag =false;
			for(int x=0;x<array.size();x++){
				Student s=array.get(x);//�������ϣ��õ�ÿһ��ѧ��
				//��ȡ��ѧ����ѧ�ţ��ͼ���¼���ѧ�űȽ�
				if(s.getId().equals(id)){
					flag=true;//˵��ѧ��������ͬ����ռ����
					break;
				}
			}
			if(flag){
				System.out.println("�����ѧ�Ŵ��ڣ�����������");
			}else{
				break;//����ѭ��
			}
		}
			System.out.println("������ѧ������");
			String name=sc.nextLine();
			System.out.println("������ѧ������");
			String age=sc.nextLine();
			System.out.println("������ѧ����ס��");
			String address=sc.nextLine();
			
			//����ѧ������
			Student s=new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			
			//��ѧ��������ΪԪ����ӵ�����
			array.add(s);
			//��ʾ
			System.out.println("��ӳɹ�");
		   
		}
}


package com.wqc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*1:����ѧ����
* 2��ѧ������ϵͳ������������д
* 3��ѧ������ϵͳ�Ĳ鿴����ѧ���Ĵ����д
* 4��ѧ������ϵͳ�����ѧ���Ĵ����д
* 5��ѧ������ϵͳ��ɾ��ѧ���Ĵ����д
* 6��ѧ������ϵͳ���޸�ѧ���Ĵ����д
*/
public class StudentManagerTest {
	public static void main(String[] args) throws IOException {
		//�������϶������ڴ洢ѧ������
		ArrayList<Student> array=new ArrayList<Student>();
		//������
		//Ϊ��ѡ��֮��ص������棬ѭ�� 	
		while(true){
		
			System.out.println("��ӭʹ��ѧ������ϵͳ");
			System.out.println("1  �鿴ѧ��");
			System.out.println("2  ���ѧ��");
			System.out.println("3  ɾ��ѧ��");
			System.out.println("4  �޸�ѧ��");
			System.out.println("5  �˳�");
			System.out.println("s ����ѧ����Ϣ��ָ��·��");
		
			System.out.println("��ѡ��");
			//��������¼�����
			Scanner sc=new Scanner(System.in);
			String choiceString=sc.nextLine();
			//ʹ��switch ʵ��ѡ��
			switch(choiceString){
			case "1":
				//�鿴����ѧ��
				findAllStudent(array);			
				break;
			case "2":
				//���ѧ��
				addStudent(array);
				break;			
			case "3":
				//ɾ��ѧ��
				deleteStudent(array);
				break;
			case "4":
				//�޸�ѧ��
				updateStudent(array);			
				break;
			case "s":
				//����ѧ����ָ��·��
				SpecifiedPath(array);
				
			case "5":
				System.out.println("ллʹ��");
				//�˳�
				System.exit(0);//JVM�˳� 
				break; 	
				default:
					System.out.println("��������ȷ������");
					
					break;
				
				
				
				
			}
			}
	}
	
	//���沢�����ݴ浽ָ��·����
	public static void SpecifiedPath(ArrayList<Student>array) throws IOException{
		addStudent(array);
		addStudent(array);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("������Ҫ�����ѧ��ѧ��");
//		String id=sc.nextLine();
//		System.out.println("������Ҫ�����ѧ������");
//		String name=sc.nextLine();
//		System.out.println("������Ҫ�����ѧ������");
//		String age=sc.nextLine();
//		System.out.println("������Ҫ�����ѧ����ס��");
//		String address=sc.nextLine();
//	     Student s=new Student(); //����ѧ������
	       //��ѧ��������ӵ�������ȥ
		BufferedWriter bw=new BufferedWriter(new FileWriter("Student.txt")); 
		   //io��������ָ��·��
		for(int i=0;i<array.size();i++){
			Student s=array.get(i);    
			StringBuilder sb=new StringBuilder();         //���� sb��������������
			sb.append(s.getId()).append(";").append(s.getName()).append(";").append(s.getAge()).append(";").append(s.getAddress());
			bw.write(sb.toString()); //����һ�����ת��ΪString д��
			bw.newLine();
			bw.flush();           //ˢ��
		}
//		StringBuilder sb=new StringBuilder();         //���� sb��������������
//		sb.append(s.getId()).append(";").append(s.getName()).append(";").append(s.getAge()).append(";").append(s.getAddress());
//		bw.write(sb.toString()); //����һ�����ת��ΪString д��
//		bw.newLine();
//		bw.flush();           //ˢ��
		bw.close();			//�ǵùر�
	}
	
	//�޸�ѧ��
	public static void updateStudent(ArrayList<Student> array){
		//�޸�ѧ����˼·:����¼��һ��ѧ�ţ���������ȥ����
		//���Ƿ���ѧ��ʹ�õ��Ǹ�ѧ�ţ�����о��޸ĸ�ѧ��
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ��");
		String id=sc.nextLine();
		
		//����һ������
		int index=-1;
		
		//��������
		for(int x=0;x<array.size();x++){
			//��ȡÿһ��ѧ������
			Student s=array.get(x);
			//��ѧ�������ѧ�źͼ���¼���ѧ�Ž��бȽ�
			if(s.getId().equals(id)){
				index=x;
				break;
			}
		}
		if(index==-1){
			System.out.println("������˼��Ҫ�޸ĵ�ѧ�������� ");
		}else{
			System.out.println("������ѧ��������:");
			String name=sc.nextLine();
			System.out.println("������ѧ��������:");
			String age=sc.nextLine();
			System.out.println("������ѧ���¾�ס��:");
			String address=sc.nextLine();
			
			
			
			//����ѧ������
			Student s=new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			//�޸ļ����е�ѧ������
			array.set(index, s);
			
			//������ʾ
			
			System.out.println("�޸ĳɹ�");
    }
				
	}

	//�鿴����ѧ������
	public static void findAllStudent(ArrayList<Student> array) throws IOException {
//		System.out.println("������Ҫ�鿴��ѧ����������");
//		Scanner sc=new Scanner(System.in);
//		String link=sc.nextLine();
//		String url="Student.txt";
//		if(link==url){
//			System.out.println("ѧ����������");
//		}else{
//			System.out.println("û���ҵ���");
//		}
		//Ҫ�жϼ�������û�����ݣ����û�����ݸ���ʾ���ҽ�����
		if(array.size()==0){
			System.out.println("û��ѧ�����ݣ�����������������²���");
			return; //��Ϊ���ܴ�������Ǿ仰������Ҫ�ȷ���
					//������void��û�з���ֵ������return���治�ܴ�����ֵ��ֱ��return;
//		}
		//����io������br
//		BufferedReader br=new BufferedReader(new FileReader("Student.txt"));
//		String line;
//		while((line=br.readLine())!=null){
//			String[] strArry=line.split(";");
//			//����ѧ�����󲢸�ֵ
//			Student s=new Student();
//			s.setId(strArry[0]);
//			s.setName(strArry[1]);
//			s.setAge(strArry[2]);
//			s.setAddress(strArry[3]);
//			//��ѧ��������ΪԪ�ش��浽����
//			array.add(s);
//			
		}
		//br.close();
			
		
		
		//\t һ��tab����λ��
		System.out.println("ѧ��     ����     ����     ��ס��ַ");
		for(int x=0;x<array.size();x++){
			Student s=array.get(x);
			System.out.println(s.getId()+"--"+s.getName()+"--"+s.getAge()+"--"+s.getAddress());
			
		}
	}
	//ɾ��ѧ��
	public static void deleteStudent(ArrayList<Student> array){
		//��ôɾ��ѧ��:����¼��һ��ѧ��
		//��������ȥ���ң����Ƿ���ѧ��ʹ�õ��Ǹ�ѧ�ţ�����о�ɾ������
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫɾ����ѧ����ѧ��");
		String id=sc.nextLine();
		
		//����һ����������ѧ�Ų�����ʱ
		int index=-1;
		//��������
		for(int x=0;x<array.size();x++){
			//��ȡÿһ��ѧ������
			Student s=array.get(x);
			//�����ѧ�������ѧ�źͼ���¼���ѧ�Ž��бȽ�
			if(s.getId().equals(id)){
				//array.remove(x);��������ɾ��
				index=x;
				break;
			}
		}
		if(index==-1){
			System.out.println("��Ҫɾ����ѧ�Ŷ�Ӧ����Ϣ������");
			
		}else{
			array.remove(index);
			System.out.println("ɾ��ѧ���ɹ�");
		}
		
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
//		System.out.println("������ѧ������");
//		String name=sc.nextLine();
//		System.out.println("������ѧ������");
//		String age=sc.nextLine();
//		System.out.println("������ѧ����ס��");
//		String address=sc.nextLine();

		//����ѧ������
		Student s=new Student();
	
		s.setId(id);
		System.out.println("������ѧ������");
		s.setName(sc.nextLine());
		System.out.println("������ѧ������");
		s.setAge(sc.nextLine());
		System.out.println("������ѧ����ס��");
		s.setAddress(sc.nextLine());
		
		//��ѧ��������ΪԪ����ӵ�����
		array.add(s);
		//��ʾ
		System.out.println("��ӳɹ�");
	   
	}
	
}

package com.wqc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FindStudentDemo {
public static void main(String[] args) throws IOException  {
	//�����������������
	BufferedReader br=new BufferedReader(new FileReader("Student.txt"));
	//�������϶���
	ArrayList<Student> array=new ArrayList<Student>();
	
	//����һ���ַ���������ȡ�����ݷָ���Ҳ���Ϊ��
	String data;
	while((data=br.readLine())!=null){
	//�ã��ָ��ַ���	
		String[] strArray=data.split(";");
		//����ѧ�������Ҹ�ֵ
		Student s=new Student();
		s.setId(strArray[0]);
		s.setName(strArray[1]);
		s.setAge(strArray[2]);
		s.setAddress(strArray[3]);
		
		//��ѧ������洢������
		array.add(s);
		
		
		
	}
	//�ر�
	br.close();
	//�������ϣ��������
	for(int i=0;i<array.size();i++){
		Student s=array.get(i);
		System.out.println(s.getId()+"---"+s.getName()+"---"+s.getAge()+"---"+s.getAddress());
	}
}


}

package com.wqc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FindStudentDemo {
public static void main(String[] args) throws IOException  {
	//创建输出缓冲流对象
	BufferedReader br=new BufferedReader(new FileReader("Student.txt"));
	//创建集合对象
	ArrayList<Student> array=new ArrayList<Student>();
	
	//定义一个字符串，将读取的数据分割；并且不能为空
	String data;
	while((data=br.readLine())!=null){
	//用；分割字符串	
		String[] strArray=data.split(";");
		//创建学生对象并且赋值
		Student s=new Student();
		s.setId(strArray[0]);
		s.setName(strArray[1]);
		s.setAge(strArray[2]);
		s.setAddress(strArray[3]);
		
		//把学生对象存储到集合
		array.add(s);
		
		
		
	}
	//关闭
	br.close();
	//遍历集合，输出数据
	for(int i=0;i<array.size();i++){
		Student s=array.get(i);
		System.out.println(s.getId()+"---"+s.getName()+"---"+s.getAge()+"---"+s.getAddress());
	}
}


}

package com.wqc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 *
 * 分析：
 * 		A:定义学生类
 * 		B:创建集合对象
 * 		C:写方法实现键盘录入学生信息，并把学生对象作为元素添加到集合
 * 		D:创建输出缓冲流对象
 * 		E:遍历集合,得到每一个学生信息，并把学生信息按照一定的格式写入文本文件
 * 			举例：001,wqc,30,北京
 * 		F:释放资源

 * @author WQC
 *
 */
public class ArrayListToFile {
public static void main(String[] args) throws IOException {
	//创建集合对象
	ArrayList<Student> array=new ArrayList<Student>();
	
	//写方法实现键盘录入学生信息,并把学生对象作为元素添加到集合
	addStudent(array);
	addStudent(array);
	addStudent(array);
	
	//创建输出缓冲流对象
	BufferedWriter bw=new BufferedWriter(new FileWriter("array.txt"));
	//遍历集合    得到每一个学生信息，并把信息按照一定格式写入文件
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
	//添加学生
		public static void addStudent(ArrayList<Student> array){
			//创建键盘录入对象
			Scanner sc=new Scanner(System.in);
			
			
			//为了让id 被下面访问到，在循环外创建id
			String id; 
			while(true){// 为了让代码回到这里，使用循环
			System.out.println("请输入学生学号");
			 id =sc.nextLine();
			//因为可能会有输入学号一样的情况
			//但现实情况不可能出现学号相同的情况，所以
			//定义一个标记
			boolean flag =false;
			for(int x=0;x<array.size();x++){
				Student s=array.get(x);//遍历集合，拿到每一个学生
				//获取该学生的学号，和键盘录入的学号比较
				if(s.getId().equals(id)){
					flag=true;//说明学号输入相同，被占用了
					break;
				}
			}
			if(flag){
				System.out.println("输入的学号存在，请重新输入");
			}else{
				break;//结束循环
			}
		}
			System.out.println("请输入学生姓名");
			String name=sc.nextLine();
			System.out.println("请输入学生年龄");
			String age=sc.nextLine();
			System.out.println("请输入学生居住地");
			String address=sc.nextLine();
			
			//创建学生对象
			Student s=new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			
			//吧学生对象作为元素添加到集合
			array.add(s);
			//提示
			System.out.println("添加成功");
		   
		}
}


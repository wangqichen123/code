package com.wqc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*1:定义学生类
* 2：学生管理系统的主界面代码编写
* 3：学生管理系统的查看所有学生的代码编写
* 4：学生管理系统的添加学生的代码编写
* 5：学生管理系统的删除学生的代码编写
* 6：学生管理系统的修改学生的代码编写
*/
public class StudentManagerTest {
	public static void main(String[] args) throws IOException {
		//创建集合对象，用于存储学生数据
		ArrayList<Student> array=new ArrayList<Student>();
		//主界面
		//为了选择之后回到主界面，循环 	
		while(true){
		
			System.out.println("欢迎使用学生管理系统");
			System.out.println("1  查看学生");
			System.out.println("2  添加学生");
			System.out.println("3  删除学生");
			System.out.println("4  修改学生");
			System.out.println("5  退出");
			System.out.println("s 保存学生信息到指定路径");
		
			System.out.println("请选择");
			//创建键盘录入对象
			Scanner sc=new Scanner(System.in);
			String choiceString=sc.nextLine();
			//使用switch 实现选择
			switch(choiceString){
			case "1":
				//查看所有学生
				findAllStudent(array);			
				break;
			case "2":
				//添加学生
				addStudent(array);
				break;			
			case "3":
				//删除学生
				deleteStudent(array);
				break;
			case "4":
				//修改学生
				updateStudent(array);			
				break;
			case "s":
				//保存学生到指定路径
				SpecifiedPath(array);
				
			case "5":
				System.out.println("谢谢使用");
				//退出
				System.exit(0);//JVM退出 
				break; 	
				default:
					System.out.println("请输入正确的数字");
					
					break;
				
				
				
				
			}
			}
	}
	
	//保存并把数据存到指定路径下
	public static void SpecifiedPath(ArrayList<Student>array) throws IOException{
		addStudent(array);
		addStudent(array);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入要保存的学生学号");
//		String id=sc.nextLine();
//		System.out.println("请输入要保存的学生姓名");
//		String name=sc.nextLine();
//		System.out.println("请输入要保存的学生年龄");
//		String age=sc.nextLine();
//		System.out.println("请输入要保存的学生居住地");
//		String address=sc.nextLine();
//	     Student s=new Student(); //创建学生对象
	       //将学生对象添加到集合中去
		BufferedWriter bw=new BufferedWriter(new FileWriter("Student.txt")); 
		   //io流操作，指定路径
		for(int i=0;i<array.size();i++){
			Student s=array.get(i);    
			StringBuilder sb=new StringBuilder();         //创建 sb对象供下条语句调用
			sb.append(s.getId()).append(";").append(s.getName()).append(";").append(s.getAge()).append(";").append(s.getAddress());
			bw.write(sb.toString()); //将上一条语句转换为String 写入
			bw.newLine();
			bw.flush();           //刷新
		}
//		StringBuilder sb=new StringBuilder();         //创建 sb对象供下条语句调用
//		sb.append(s.getId()).append(";").append(s.getName()).append(";").append(s.getAge()).append(";").append(s.getAddress());
//		bw.write(sb.toString()); //将上一条语句转换为String 写入
//		bw.newLine();
//		bw.flush();           //刷新
		bw.close();			//记得关闭
	}
	
	//修改学生
	public static void updateStudent(ArrayList<Student> array){
		//修改学生的思路:键盘录入一个学号，到集合中去查找
		//看是否有学生使用的是该学号，如果有就修改该学生
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你要修改的学生的学号");
		String id=sc.nextLine();
		
		//定义一个索引
		int index=-1;
		
		//遍历集合
		for(int x=0;x<array.size();x++){
			//获取每一个学生对象
			Student s=array.get(x);
			//拿学生对象的学号和键盘录入的学号进行比较
			if(s.getId().equals(id)){
				index=x;
				break;
			}
		}
		if(index==-1){
			System.out.println("不好意思，要修改的学生不存在 ");
		}else{
			System.out.println("请输入学生新姓名:");
			String name=sc.nextLine();
			System.out.println("请输入学生新年龄:");
			String age=sc.nextLine();
			System.out.println("请输入学生新居住地:");
			String address=sc.nextLine();
			
			
			
			//创建学生对象
			Student s=new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			//修改集合中的学生对象
			array.set(index, s);
			
			//给出提示
			
			System.out.println("修改成功");
    }
				
	}

	//查看所有学生方法
	public static void findAllStudent(ArrayList<Student> array) throws IOException {
//		System.out.println("请输入要查看的学生数据链接");
//		Scanner sc=new Scanner(System.in);
//		String link=sc.nextLine();
//		String url="Student.txt";
//		if(link==url){
//			System.out.println("学生数据如下");
//		}else{
//			System.out.println("没有找到！");
//		}
		//要判断集合里有没有数据，如果没有数据给提示并且结束掉
		if(array.size()==0){
			System.out.println("没有学生数据！！，请回主界面重新操作");
			return; //因为不能打出下面那句话，所有要先返回
					//并且是void，没有返回值，所以return后面不能带返回值，直接return;
//		}
		//创建io流对象br
//		BufferedReader br=new BufferedReader(new FileReader("Student.txt"));
//		String line;
//		while((line=br.readLine())!=null){
//			String[] strArry=line.split(";");
//			//创建学生对象并赋值
//			Student s=new Student();
//			s.setId(strArry[0]);
//			s.setName(strArry[1]);
//			s.setAge(strArry[2]);
//			s.setAddress(strArry[3]);
//			//把学生对象作为元素储存到集合
//			array.add(s);
//			
		}
		//br.close();
			
		
		
		//\t 一个tab键的位置
		System.out.println("学号     姓名     年龄     居住地址");
		for(int x=0;x<array.size();x++){
			Student s=array.get(x);
			System.out.println(s.getId()+"--"+s.getName()+"--"+s.getAge()+"--"+s.getAddress());
			
		}
	}
	//删除学生
	public static void deleteStudent(ArrayList<Student> array){
		//怎么删除学生:键盘录入一个学号
		//到集合中去查找，看是否有学生使用的是该学号，如果有就删除该生
		Scanner sc=new Scanner(System.in);
		System.out.println("输入你要删除的学生的学号");
		String id=sc.nextLine();
		
		//定义一个索引，当学号不存在时
		int index=-1;
		//遍历集合
		for(int x=0;x<array.size();x++){
			//获取每一个学生对象
			Student s=array.get(x);
			//拿这个学生对象的学号和键盘录入的学号进行比较
			if(s.getId().equals(id)){
				//array.remove(x);根据索引删除
				index=x;
				break;
			}
		}
		if(index==-1){
			System.out.println("您要删除的学号对应的信息不存在");
			
		}else{
			array.remove(index);
			System.out.println("删除学生成功");
		}
		
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
//		System.out.println("请输入学生姓名");
//		String name=sc.nextLine();
//		System.out.println("请输入学生年龄");
//		String age=sc.nextLine();
//		System.out.println("请输入学生居住地");
//		String address=sc.nextLine();

		//创建学生对象
		Student s=new Student();
	
		s.setId(id);
		System.out.println("请输入学生姓名");
		s.setName(sc.nextLine());
		System.out.println("请输入学生年龄");
		s.setAge(sc.nextLine());
		System.out.println("请输入学生居住地");
		s.setAddress(sc.nextLine());
		
		//吧学生对象作为元素添加到集合
		array.add(s);
		//提示
		System.out.println("添加成功");
	   
	}
	
}

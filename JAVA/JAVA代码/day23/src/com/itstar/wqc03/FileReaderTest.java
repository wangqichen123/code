package com.itstar.wqc03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		
		//1 
		File file=new File("D:\\1\\javaTest\\3.txt");
		
		//2 新建 fileReader 对象
		FileReader fd=null;
		try {
			fd=new FileReader(file);
			//step 3读取数据
			//方式1 一个字符一个字符读入
			int data=0;
			try {
				while((data=fd.read())!=-1){
					System.out.println((char)data);	
				}
				//方法2 读入一个字符数组
				char[] cbuf=new char[10];
				String s="";
				while((data=fd.read(cbuf))!=-1){
					
					String str=new String(cbuf,0,data);
					s+=str;
				}
				System.out.println(s);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//关闭字符读入流
			if(fd!=null){
				try {
					fd.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
}

package com.itstar.wqc01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderTest {
	public static void main(String[] args) {
		
		//1 新建reader
		FileReader reader=null;
		BufferedReader br=null;
		try {
			 reader=new FileReader(new File("D:\\1\\javaTest\\file4.txt"));
			 br=new BufferedReader(reader);
			 StringBuffer sb=new StringBuffer();
			 
			 //读取数据
			 String temp="";
			 int count=0;
			 Object bufferedReader;
			while(temp=((Object) bufferedReader).readline()!=null){
				 
	
			 }
			 br.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}

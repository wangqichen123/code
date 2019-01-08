package com.itstar.wqc01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {
	public static void main(String[] args) {
		//1 新建FIle 对象
		File file=new File("D:\\1\\javaTest\\file2.txt");
		String content="晚上好，好好学习";
		
		//2 新建一个firewriter的对象
		FileWriter fw=null;
		try {
			fw=new FileWriter(file,true);
			//3 开始写数据
			fw.write(content);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//4 关闭文件流
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
}

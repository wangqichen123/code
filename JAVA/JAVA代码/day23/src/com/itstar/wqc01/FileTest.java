package com.itstar.wqc01;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//1 新建一个文件
		File file =new File("D:\\1\\javaTest\\file1.txt");
		
	
		//2 如果文件不存在 创建文件
		try {
			 if(!file.exists())
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

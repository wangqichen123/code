package com.itstar.wqc01;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//1 �½�һ���ļ�
		File file =new File("D:\\1\\javaTest\\file1.txt");
		
	
		//2 ����ļ������� �����ļ�
		try {
			 if(!file.exists())
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

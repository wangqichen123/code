package com.itstar.wqc01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {
	public static void main(String[] args) {
		//1 �½�FIle ����
		File file=new File("D:\\1\\javaTest\\file2.txt");
		String content="���Ϻã��ú�ѧϰ";
		
		//2 �½�һ��firewriter�Ķ���
		FileWriter fw=null;
		try {
			fw=new FileWriter(file,true);
			//3 ��ʼд����
			fw.write(content);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//4 �ر��ļ���
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

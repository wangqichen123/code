package com.itstar.wqc01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		
		//1�½�file ����
		
		File file=new File("D:\\1\\javaTest\\file3.txt");
		//2����inputStreamReader����
		InputStreamReader str=null;
		
		try {
		 isr=new InputStreamReader(new FileInputStream(file),"utf-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

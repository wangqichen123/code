package com.itstar.wqc01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class objectInputStreamTest01 {
	
	public static void main(String[] args){
		//1 ≥ı ºªØ objectInputStream
		ObjectInputStream ois=null;
		FileInputStream fs=null;
		
		try {
			fs=new FileInputStream(new File("D:\\1\\javaTest\\4.txt"));
			ois=new ObjectInputStream(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

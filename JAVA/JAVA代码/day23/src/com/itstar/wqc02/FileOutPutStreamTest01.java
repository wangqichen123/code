package com.itstar.wqc02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest01 {
	public static void main(String[] args) {
		//1 建立文件对象
		File file=new File("D:\\1\\javaTest\\2.txt");
		
		String content="祝大家双十二开心";
		
		//建立输出流
		FileOutputStream fos=null;
		
		try {
			//3 新建对象 实例化对象
			fos=new FileOutputStream(file,true);
			//3.1 一个一个字节写入
			byte[]bytes=content.getBytes();
			for(byte b:bytes){
//				fos.write(b);
				try {
					fos.write(b);
//					fos.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//4 关闭输出流
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
}

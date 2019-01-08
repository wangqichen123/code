package com.itstar.wqc01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hwpf.extractor.WordExtractor;

public class POITest {
	public static void main(String[] args) {
		//1 初始化 word 操作类 wordExtractor
		FileInputStream fs=null;
		WordExtractor ex=null;
		
		try {
			fs=new FileInputStream(new File("D:\\1\\javaTest\\test.docx"));
			ex=new WordExtractor(fs);
			//2 读取内容  
			String text=ex.getText();
			System.out.println(text);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fs!=null){
				try {
					fs.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

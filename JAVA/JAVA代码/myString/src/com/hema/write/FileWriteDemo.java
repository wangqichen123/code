package com.hema.write;

import java.io.FileWriter;
import java.io.IOException;
/*
 * FileWriter(String fileName):传递一个文件名称
 * 输出流写数据的步骤：
 * 		A:创建输出流对象
 * 		B:调用输出流对象的写数据的方法
 * 		C:释放资源
 *  void write(String str) 向文件中写str
    void flush()  将内存中的数据刷新到文件中
    void close()  关流释放系统底层资源

 * 
 */
public class FileWriteDemo {
	public static  void main(String[] args) throws IOException  {
		
		
	
		FileWriter	fw = new FileWriter("D:\\QQ管家\\lianxi\\eqc.txt");				
//		fw.write("waidjoaw");	
//		fw.flush();
//		fw.write("好");
//		fw.flush();
//		fw.close();
		char []chr={'a','b','c','d','e','f'};
		fw.write(chr);
		fw.flush();
		fw.close();
		
		
	}

}

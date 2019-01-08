package com.hema.write;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 *  FileReader:
 *  FileReader(String fileName):传递文件名称

 * 
 */
public class FileReadDemo {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("D:\\QQ管家\\lianxi\\c.txt");
	FileWriter fw=new FileWriter("D:\\QQ管家\\lianxi\\c.txt");
	char[] chs = new char[1024];
	int len;
	while((len=fr.read(chs))!=-1) {
		fw.write(chs, 0, len);
	}
	fw.close();
	fr.close();

}
}

package com.hema.write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo2 {
public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("D:\\QQ¹Ü¼Ò\\lianxi\\c.txt",true);
	 for(int i=0;i<10;i++){
		 fw.write("wqc"+i);
		 fw.write("\r\n");
	 }
	 fw.close();
}
}

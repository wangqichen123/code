package myioclass;

import java.io.FileReader;
import java.io.IOException;

public class MyIoDemo {
public static void main(String[] args) {
	//System.out.println("HelloWorld");
	
	try {
//		FileWriter fw=new FileWriter("D:\\1\\01.java����(��300������)\\file\\a.txt",true);
//		fw.write("abc\r\n");
//		fw.flush();
//		String str="Hello���dhwau84194\r\n";
////		fw.write(str, 0, str.length());
//		char[] cbuf=str.toCharArray();
//		fw.write(cbuf, 0, cbuf.length);
//		fw.flush(); 
//		fw.close();
		
		FileReader fr=new FileReader("D:\\1\\01.java����(��300������)\\file\\a.txt");
		String str="";					//����һ��String ����,����Ϊ�� 
    	char[] cbuf=new char[10];       
    	while(fr.read(cbuf)!=-1){
    		 str=str+cbuf.toString();  //��cbufת��ΪString ,��Str����ƴ��;
    		System.out.print(cbuf);		//���
    	}
//		fr.read(cbuf);
//		System.out.println(cbuf);
		
		
		
		
		fr.close();
		
	} catch (IOException e) {
		
		e.printStackTrace();
		
	}
}
}

package com.hema.write;

import java.io.FileWriter;
import java.io.IOException;
/*
 * FileWriter(String fileName):����һ���ļ�����
 * �����д���ݵĲ��裺
 * 		A:�������������
 * 		B:��������������д���ݵķ���
 * 		C:�ͷ���Դ
 *  void write(String str) ���ļ���дstr
    void flush()  ���ڴ��е�����ˢ�µ��ļ���
    void close()  �����ͷ�ϵͳ�ײ���Դ

 * 
 */
public class FileWriteDemo {
	public static  void main(String[] args) throws IOException  {
		
		
	
		FileWriter	fw = new FileWriter("D:\\QQ�ܼ�\\lianxi\\eqc.txt");				
//		fw.write("waidjoaw");	
//		fw.flush();
//		fw.write("��");
//		fw.flush();
//		fw.close();
		char []chr={'a','b','c','d','e','f'};
		fw.write(chr);
		fw.flush();
		fw.close();
		
		
	}

}

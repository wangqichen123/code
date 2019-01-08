package myioclass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyIoDemo2 {
public static void main(String[] args) throws IOException {
	
	BufferedWriter bw=new BufferedWriter(new FileWriter("4.txt"));
	bw.write("wqc123");
	bw.newLine();
	bw.flush();
	bw.close();
	
	BufferedReader br=new BufferedReader(new FileReader("3.txt"));
	String str;
	//str!=null;
	//while(br.read())
	while( (str=br.readLine())!=null ){
		System.out.println(str);
	}
	br.readLine();
	br.close();
}
}

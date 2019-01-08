package myioclass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoBuffDemo {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("3.txt");
	BufferedWriter bf=new BufferedWriter(fw);
	bf.write("wqcwqc");
	bf.flush();
	bf.close();
	
	FileReader fr=new FileReader("3.txt");
	BufferedReader br=new BufferedReader(fr);
	char[] cbuf=new char[1024];
	
	br.read(cbuf);
	System.out.println(cbuf);
	br.close();
	
}
}
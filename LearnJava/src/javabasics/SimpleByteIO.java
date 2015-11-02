package javabasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleByteIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fileIn = new File("./data/in.txt");
		File fileOut = new File("./data/out.txt");
		FileInputStream in = new FileInputStream(fileIn);
		FileOutputStream out = new FileOutputStream(fileOut);
		int c;
		while((c=in.read()) != -1){
			out.write(c);
		}
		if(in != null)
			in.close();
		if(out != null)
			out.close();
	}

}

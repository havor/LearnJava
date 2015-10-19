package basics.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
	public static void main(String args[]) throws IOException{
		FileInputStream in = new FileInputStream("./data/in.txt");
		FileOutputStream out = new FileOutputStream("./data/out.txt");
		int c;
		try {
			while((c = in.read()) != -1){
				out.write(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(in != null) in.close();
			if(out != null) out.close();
		}
	}

}

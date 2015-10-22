package basics.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteNoneHtmlLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Console c = System.console();
//		if(c == null){
//            System.err.println("No console.");
//            System.exit(1);
//		}
		
		String sourceFileName = args[0];
		String destFileName = sourceFileName + "_copy.txt";
//		if (args.length != 0) filename = args[0];
//		
//		while ( filename.isEmpty()){
//			filename = c.readLine("No file to process, please input filename: ");
//		}
		
		BufferedReader in = null;
		PrintWriter out = null;
		
		in = new BufferedReader(new FileReader(sourceFileName));
		out = new PrintWriter(new FileWriter(destFileName));
		String line;
		while((line = in.readLine()) != null){
			
			if (line.contains("<")){
				System.out.println(line);
				out.println(line);
			}
		}
		
		if(in != null) in.close();
		if(out != null) out.close();
				


	}

}

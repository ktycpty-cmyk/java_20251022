package ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOStream02 {

	public static void main(String[] args) throws IOException{
		
		Writer out = new FileWriter("D:/data/data.txt");
		
		out.write("A");
		out.write("B");
		out.write("C");
		out.write("D");
		out.write("E");
		out.write("G");
		
		out.close();
		
		Reader in = new FileReader("D:/data/data.txt");
		
		int ch;
		
		while((ch = in.read()) != -1) {
			//System.out.println(ch);
			System.out.println((char)ch);
		}
		
		in.close();

	}

}

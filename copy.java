package chap18;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOEx2OutputStream {
	public static void main(String[] args) throws Exception {
		FileInputStream fis 
		= new FileInputStream("src/chap18/IOEx2OutputStream.java");
		FileOutputStream fos
		= new FileOutputStream("copy.java");
		
		int b = 0;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		
		fis.close();
		fos.close();
	}
}	







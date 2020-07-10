package chap18;

import java.io.FileInputStream;

public class IOEx1InputStream {
	public static void main(String[] args) throws Exception {
		FileInputStream fis 
		= new FileInputStream("src/chap18/IOEx1InputStream.java");
		
//		int f = fis.read();
//		System.out.println(f);
		
		int f = 0;
		int bytes = 0;
		while ((f = fis.read()) != -1) {
			bytes++;
		}
		System.out.println(bytes);
	}
}








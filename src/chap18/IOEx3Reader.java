//한글
package chap18;

import java.io.FileReader;

// 한글 
public class IOEx3Reader {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("src/chap18/IOEx3Reader.java");
		fr.read();
		fr.read();
		char c = (char) fr.read();
		System.out.println(c);
		
		
		fr.close();
	}
}

package chap18;

import java.io.FileReader;
import java.io.FileWriter;

public class IOEx4Writer {
	public static void main(String[] args) throws Exception {
		// 파일 복사 
		FileReader fr = new FileReader("src/chap18/IOEx4Writer.java");
		FileWriter fw = new FileWriter("copy-char.java");

		int c = 0;
		while ((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();
	}
}





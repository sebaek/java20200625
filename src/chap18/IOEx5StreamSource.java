//한글
package chap18;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class IOEx5StreamSource {
	public static void main(String[] args) throws Exception {
		FileInputStream fis 
		= new FileInputStream("src/chap18/IOEx5StreamSource.java");
		InputStreamReader isr = new InputStreamReader(fis);
		isr.read();
		isr.read();
		char c = (char) isr.read();
		System.out.println(c);

		
		
		isr.close();
		fis.close();
		
	}
}

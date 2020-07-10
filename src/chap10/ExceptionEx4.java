package chap10;

public class ExceptionEx4 {
	public static void main(String[] args) throws ClassNotFoundException {
		method1();
	}
	
	public static void method1() throws ClassNotFoundException {
		method2();
	}
	
	public static void method2() throws ClassNotFoundException {
		Class.forName("");
	}
}






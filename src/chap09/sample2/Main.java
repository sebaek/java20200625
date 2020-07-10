package chap09.sample2;

public class Main {
	public static void main(String[] args) {
		MyInterface o1 = new MyInterface() {
			@Override
			public void method() {
			}
		};
		
		o1.method();
		
		MyInterface o2 = () -> System.out.println("hello");
		
		o2.method();
		
	}
}








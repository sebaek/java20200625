package chap09.sample3;

public class Main {
	public static void main(String[] args) {
		MyInterface m1 = new MyInterface() {
			@Override
			public void method(int a, int b) {
				
				
			}
		};
		
		MyInterface m2 = (a, b) -> {
			
		};
		
		
		MyInterface2 i2 = (a) -> {
			return 3;
		};
		
		MyInterface2 i3 = a -> a * 2;
		int k = i3.method(99);
		System.out.println(k);
	}
}











package chap06;

public class MainEx1 {
	public static void main(String[] args) {
		ClassEx1 a = new ClassEx1();
		
		System.out.println(a.a);
		System.out.println(a.i);
		System.out.println(a.s);
		
		a.method1();
		a.method2();
		
		ClassEx1 b = a;
		b.i = 99;
		
		System.out.println(a.i);
		
		change(b);
		System.out.println(b.i);
		System.out.println(a.i);
	}
	
	private static void change(ClassEx1 a) {
		a.i = 300;
	}
	
}
















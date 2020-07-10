package chap06;

public class MainEx2 {
	public static void main(String[] args) {
		ClassEx2Static c = new ClassEx2Static();
		System.out.println(c.i);
		c.method();
		
		System.out.println(c.j);
		c.method2();
		
		System.out.println(ClassEx2Static.j);
		ClassEx2Static.method2();
	}
}

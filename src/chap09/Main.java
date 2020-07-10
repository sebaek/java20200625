package chap09;

public class Main {
	public static void main(String[] args) {
		MyClass.NestedClass2 n2 = new MyClass.NestedClass2();
//		MyClass.NestedClass1 n1 = new MyClass.NestedClass1();
		
		MyClass m1 = new MyClass();
		MyClass.NestedClass1 n1 = m1.new NestedClass1();
		
		
	}
}

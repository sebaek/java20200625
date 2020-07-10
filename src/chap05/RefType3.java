package chap05;

public class RefType3 {
	public static void main(String[] args) {
		String s = "java";
		String s1 = "java";
		String s2 = new String("java");
		
		System.out.println(s == s1);
		System.out.println(s1 == s2);
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		
	}
}

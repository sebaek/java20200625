package chap05;

public class RefType2 {
	public static void main(String[] args) {
		String s = new String("str");
		
		String s1 = s;
		
		int i = 3;
		int j = i;
		
		System.out.println(i == j);
		
		System.out.println(s == s1);
		
		System.out.println(s.length());
		System.out.println(s1.length());
	}
}










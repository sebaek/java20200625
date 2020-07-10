package chap10;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int i = 3;
		try {
			System.out.println(i / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}

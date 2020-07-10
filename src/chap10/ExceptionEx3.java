package chap10;

public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			int i = 0;
			
			System.out.println(3 / i);
			Class.forName("");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}







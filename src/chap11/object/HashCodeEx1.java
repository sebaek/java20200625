package chap11.object;

public class HashCodeEx1 {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		b1.isbn = 100;
		b2.isbn = 100;
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}
}

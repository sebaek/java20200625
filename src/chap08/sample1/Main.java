package chap08.sample1;

public class Main {
	public static void main(String[] args) {
		Cat c = new Cat();
		Pet p = c;
		p.sit();
//		p.cry();
		
		Pet p2 = new Malamute();
		p2.sit();
	}
}

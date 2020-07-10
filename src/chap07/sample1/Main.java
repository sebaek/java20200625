package chap07.sample1;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.cry();
		KindaCat kc1;
//		kc1 = new KindaCat();
		kc1 = cat1;
		System.out.println(kc1 == cat1);
		kc1.cry();
		
		Tiger tig1 = new Tiger();
		tig1.cry();
		tig1.hunt();
		
		KindaCat kc2 = tig1;
		kc2.cry();
//		kc2.hunt();
		
		Tiger tig2 = (Tiger) kc2;
		Cat cat3 = (Cat) kc2;
	}
	
	private static void printCry(KindaCat c) {
		c.cry();
	}
}



















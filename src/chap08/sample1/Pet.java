package chap08.sample1;

public interface Pet {
	public static final int i =3;
	
	void sit();
	
	public static void method() {
		System.out.println("스태틱 메소드");
	}
	
	public default void method2() {
		System.out.println("인스턴스 메소드");
	}
}

package chap12;

public class ThreadEx1 {
	public static void main(String[] args) {
		Thread t = new Thread(new MyRun());
		
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("main thread" + i);
		}
	}
}

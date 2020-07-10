package chap12;

public class MyThread2 implements Runnable {
	public int i = 0;
	
	@Override
	public void run() {
		int k = 0;
		Thread t = Thread.currentThread();
		for (int i = 0; i < 10000; i++) {
			this.i++;
			k++;
//			System.out.println(t.getName() + ", " + i);
		}
		System.out.println(k);
	}
}

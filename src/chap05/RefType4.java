package chap05;

public class RefType4 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		int[] arr2 = arr;
		
		arr2[0] = 9;
		
		System.out.println(arr[0]);
		
		int i = 3;
		print(i);
		change(arr2);
		
		System.out.println(arr[1]);
	}
	
	private static void print(int k) {
		System.out.println(k);
	}
	
	private static void change(int[] ar) {
		ar[1] = 10;
	}
}













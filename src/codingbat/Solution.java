package codingbat;

public class Solution {
	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	public int sumDouble(int a, int b) {
		int sum = a + b;

		if (a == b) {
			sum *= 2;
		}

		return sum;
	}

	public int diff21(int n) {
		int diff = Math.abs(21 - n);

		if (n > 21) {
			diff *= 2;
		}

		return diff;
	}

	public boolean parrotTrouble(boolean talking, int hour) {

		return talking && (hour < 7 || hour > 20);
	}

	public boolean makes10(int a, int b) {
		boolean a10 = a == 10;
		boolean b10 = b == 10;
		boolean sum10 = (a + b) == 10;

		return a10 || b10 || sum10;
	}

}

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

	public boolean nearHundred(int n) {
		boolean near100 = Math.abs(100 - n) <= 10;
		boolean near200 = Math.abs(200 - n) <= 10;

		return near100 || near200;
	}

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return a < 0 && b < 0;
		} else {
			return a * b < 0;
		}
	}

	public String notString(String str) {
		if (str.startsWith("not")) {
			return str;
		} else {
			return "not " + str;
		}

	}

	public String missingChar(String str, int n) {
		return str.substring(0, n) + str.substring(n + 1);
	}

	public String frontBack(String str) {
		if (str.length() > 1) {
			String first = str.substring(0, 1);
			String last = str.substring(str.length() - 1);
			String mid = str.substring(1, str.length() - 1);

			return last + mid + first;
		}

		return str;
	}

	public String front3(String str) {
		int len = (str.length() >= 3) ? 3 : str.length();

		String front = str.substring(0, len);
		return front + front + front;
	}

	public String backAround(String str) {
		char last = str.charAt(str.length() - 1);
		return last + str + last;
	}

	public boolean or35(int n) {
		return (n % 3) == 0 || (n % 5) == 0;
	}

	public String front22(String str) {
		int len = str.length() < 2 ? str.length() : 2;

		String front = str.substring(0, len);
		return front + str + front;
	}

	public boolean startHi(String str) {
		return str.startsWith("hi");
	}

	public boolean icyHot(int temp1, int temp2) {
		boolean t1 = temp1 < 0 && temp2 > 100;
		boolean t2 = temp1 > 100 && temp2 < 0;

		return t1 || t2;
	}

	public boolean in1020(int a, int b) {
		boolean ia = 10 <= a && a <= 20;
		boolean ib = 10 <= b && b <= 20;

		return ia || ib;
	}

	public boolean hasTeen(int a, int b, int c) {
		boolean teena = 13 <= a && a <= 19;
		boolean teenb = 13 <= b && b <= 19;
		boolean teenc = 13 <= c && c <= 19;

		return teena || teenb || teenc;
	}

	public boolean loneTeen(int a, int b) {
		boolean teena = 13 <= a && a <= 19;
		boolean teenb = 13 <= b && b <= 19;

		return teena ^ teenb;
	}

}

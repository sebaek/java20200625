package codingbat;

public class SolutionArray2 {
	public int countEvens(int[] nums) {
		int count = 0;

		for (int num : nums) {
			if ((num % 2) == 0) {
				count++;
			}
		}

		return count;
	}

	public int bigDiff(int[] nums) {
		int min = nums[0];
		int max = nums[0];

		for (int num : nums) {
			min = Math.min(min, num);
			max = Math.max(max, num);
		}

		return max - min;
	}

	public int centeredAverage(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		int sum = 0;
		int length = nums.length;

		for (int num : nums) {
			sum += num;
			min = Math.min(min, num);
			max = Math.max(max, num);
		}

		int avg = (sum - max - min) / (length - 2);
		return avg;
	}

	public int sum13(int[] nums) {
		int sum = 0;
		boolean is13 = false;

		for (int num : nums) {
			if (num != 13) {
				if (is13) {
					is13 = false;
				} else {
					sum += num;
				}

			} else {
				is13 = true;
			}

		}

		return sum;
	}

	public int sum67(int[] nums) {
		int sum = 0;
		boolean has6 = false;

		for (int num : nums) {
			if (num == 6) {
				has6 = true;
			}

			if (has6) {
				if (num == 7) {
					has6 = false;
					continue;
				}
			}

			if (!has6) {
				sum += num;
			}

		}

		return sum;
	}

	public boolean has22(int[] nums) {
		boolean is2 = false;

		for (int num : nums) {
			if (!is2 && num == 2) {
				is2 = true;
				continue;
			}

			if (is2) {
				if (num == 2) {
					return true;
				} else {
					is2 = false;
				}
			}

		}

		return false;
	}

	public boolean sum28(int[] nums) {
		int sum = 0;

		for (int num : nums) {
			if (num == 2) {
				sum += num;
			}
		}

		return sum == 8;
	}

	public boolean more14(int[] nums) {
		int num1 = 0;
		int num4 = 0;

		for (int n : nums) {
			if (n == 1) {
				num1++;
			}

			if (n == 4) {
				num4++;
			}
		}

		return num1 > num4;
	}

	public int[] fizzArray(int n) {
		int[] res = new int[n];

		for (int i = 0; i < n; i++) {
			res[i] = i;
		}

		return res;
	}

	public boolean only14(int[] nums) {
		for (int n : nums) {
			if (n != 1 && n != 4) {
				return false;
			}
		}

		return true;
	}

	public String[] fizzArray2(int n) {
		String[] res = new String[n];

		for (int i = 0; i < n; i++) {
			res[i] = "" + i;
		}

		return res;

	}

}

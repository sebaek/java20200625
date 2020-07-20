package codingbat;

public class SolutionArray3 {
	public int maxSpan(int[] nums) {
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length - 1; j >= i; j--) {
				if (nums[i] == nums[j]) {
					max = Math.max(max, j - i + 1);
				}
			}
		}
		return max;
	}

	public int[] fix34(int[] nums) {
		int[] res = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				res[i] = 3;
			}
		}

		for (int i = 0, j = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				for (; j < nums.length; j++) {
					if (res[j] == 3) {
						break;
					}
				}

				res[j + 1] = 4;
				j++;
			}
		}

		for (int i = 0, j = 0; i < nums.length; i++) {
			if (nums[i] != 4 && nums[i] != 3) {
				for (; j < nums.length; j++) {
					if (res[j] == 0) {
						res[j] = nums[i];
					}
				}
			}
		}

		return res;

	}

	public int[] fix45(int[] nums) {
		int[] res = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				res[i] = 4;
			}
		}

		for (int i = 0, j = 0; i < nums.length; i++) {
			if (nums[i] == 5) {
				for (; j < nums.length; j++) {
					if (res[j] == 4) {
						break;
					}
				}

				res[j + 1] = 5;
				j++;
			}
		}

		for (int i = 0, j = 0; i < nums.length; i++) {
			if (nums[i] != 5 && nums[i] != 4) {
				for (; j < nums.length; j++) {
					if (res[j] == 0) {
						res[j] = nums[i];
					}
				}
			}
		}

		return res;
	}

	public boolean canBalance(int[] nums) {
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				left[i] = nums[i];
			} else {
				left[i] = nums[i] + left[i - 1];
			}
		}

		for (int i = nums.length - 1; i >= 0; i--) {
			if (i == nums.length - 1) {
				right[i] = nums[i];
			} else {
				right[i] = nums[i] + right[i + 1];
			}
			if (i > 0) {
				if (right[i] == left[i - 1]) {
					return true;
				}
			}
		}

		return false;
	}

}

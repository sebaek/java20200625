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

	public boolean linearIn(int[] outer, int[] inner) {
		int outerCur = 0;
		int innerCur = 0;

		//

		while (innerCur < inner.length && outerCur < outer.length) {
			int outerNum = outer[outerCur];
			int innerNum = inner[innerCur];

			if (outerNum == innerNum) {
				outerCur++;
				innerCur++;
			} else if (outerNum < innerNum) {
				outerCur++;
			} else {
				return false;
			}
		}

		if (innerCur >= inner.length) {
			return true;
		} else {
			return false;
		}

	}

	public int[] squareUp(int n) {
		int[] res = new int[n * n];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				res[n * i - j] = j;
			}
		}

		return res;
	}

	public int[] seriesUp(int n) {
		int len = (1 + n) * n / 2;
		int[] res = new int[len];

		for (int i = 1, k = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++, k++) {
				res[k] = j;
			}
		}

		return res;
	}

	public int maxMirror(int[] nums) {
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length - 1; j >= 0; j--) {
				max = Math.max(max, check(nums, i, j));
			}
		}

		return max;
	}

	private int check(int[] nums, int i, int j) {
		int res = 0;
		while (i < nums.length && j >= 0 && nums[i] == nums[j]) {
			i++;
			j--;
			res++;
		}

		return res;
	}

	public int countClumps(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int res = 0;
		int i = 0;
		int prev = nums[i] - 1;

		while (i < nums.length) {
			if (nums[i] == prev) {
				res++;
				while (i < nums.length && nums[i] == prev) {
					i++;
				}
			} else {
				prev = nums[i];
				i++;
			}
		}

		return res;
	}

}

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

	public boolean no14(int[] nums) {
		boolean e1 = false;
		boolean e4 = false;

		for (int n : nums) {
			if (n == 1) {
				e1 = true;
			}

			if (n == 4) {
				e4 = true;
			}
		}

		return !e1 || !e4;
	}

	public boolean isEverywhere(int[] nums, int val) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != val && nums[i + 1] != val) {
				return false;
			}
		}

		return true;
	}

	public boolean either24(int[] nums) {
		boolean e2 = false;
		boolean e4 = false;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				if (nums[i] == 2) {
					e2 = true;
				}

				if (nums[i] == 4) {
					e4 = true;
				}
			}
		}

		return e2 ^ e4;
	}

	public int matchUp(int[] nums1, int[] nums2) {
		int cnt = 0;

		for (int i = 0; i < nums1.length; i++) {
			int diff = Math.abs(nums1[i] - nums2[i]);
			if (diff == 1 || diff == 2) {
				cnt++;
			}
		}

		return cnt;
	}

	public boolean has77(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 7) {
				int next1 = 0; // nums[i+1];
				int next2 = 0; // nums[i+2];

				if (i + 1 < nums.length) {
					next1 = nums[i + 1];
				}

				if (i + 2 < nums.length) {
					next2 = nums[i + 2];
				}

				if (next1 == 7 || next2 == 7) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean has12(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] == 2) {
						return true;
					}
				}

				break;
			}
		}

		return false;
	}

	public boolean modThree(int[] nums) {

		for (int i = 1; i < nums.length - 1; i++) {
			int rCenter = nums[i] % 2;
			int rLeft = nums[i - 1] % 2;
			int rRight = nums[i + 1] % 2;

			int sum = rCenter + rLeft + rRight;

			if (sum == 3 || sum == 0) {
				return true;
			}
		}

		return false;
	}

	public boolean haveThree(int[] nums) {
		int cnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				cnt++;

				if (i + 1 < nums.length && nums[i + 1] == 3) {
					return false;
				}
			}
		}

		return cnt == 3;
	}

}

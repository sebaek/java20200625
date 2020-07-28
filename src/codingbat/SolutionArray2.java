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

}

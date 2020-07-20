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
}

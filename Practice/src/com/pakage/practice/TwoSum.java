package com.pakage.practice;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] nums = {3,2,4};
		int target = 6;
		int[] result = twoSum.twoSum(nums, target);
		if (result.length == 2) {
			System.out.println("Indices: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("No two sum solution found.");
		}
	}
	public int[] twoSum(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			 int sum =  nums[left] + nums[right];
			if (sum == target) {
				return new int[] { left, right };
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return new int[] {};
	}

}
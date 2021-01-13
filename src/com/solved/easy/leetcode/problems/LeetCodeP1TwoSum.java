package com.solved.easy.leetcode.problems;

import java.util.HashMap;

public class LeetCodeP1TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> hArrs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hArrs.containsKey(target-nums[i]))
            	return new int[] {hArrs.get(target-nums[i]),i};
            else
            	hArrs.put(nums[i], i);
        }
        return new int[] {0,0};
	}

	public static void main(String[] args) {
		int[] result = LeetCodeP1TwoSum.twoSum(new int[] { 1, 3, 6 }, 6);
	    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
	    result = LeetCodeP1TwoSum.twoSum(new int[] { 2, 5, 9, 11 }, 11);
	    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");

	}

}

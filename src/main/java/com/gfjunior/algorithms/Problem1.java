package com.gfjunior.algorithms;

import java.util.HashMap;

public class Problem1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap complements = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            final int currentValue = nums[i];
            final int complement = target - currentValue;
            if(complements.containsKey(complement)){
                return new int[]{(int) complements.get(complement), i};
            }
            complements.put(currentValue, i);
        }
        return null;
    }
}

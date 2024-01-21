package com.gfjunior.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    public void test() {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};

        int[] nums4 = {2, -17, 3, 23};
        int target4 = 6;
        int[] expected4 = {1, 3};

        int[] nums5 = {2, -17, 3, 23, -9};
        int target5 = -6;
        int[] expected5 = {2, 4};

        int[] nums6 = {2, -17, 3, 23, -9999, 5687, -87954, 17};
        int target6 = 0;
        int[] expected6 = {1, 7};

        assertArrayEquals(expected1, Problem1.twoSum(nums1, target1));
        assertArrayEquals(expected2, Problem1.twoSum(nums2, target2));
        assertArrayEquals(expected3, Problem1.twoSum(nums3, target3));
        assertArrayEquals(expected4, Problem1.twoSum(nums4, target4));
        assertArrayEquals(expected5, Problem1.twoSum(nums5, target5));
        assertArrayEquals(expected6, Problem1.twoSum(nums6, target6));
    }
}
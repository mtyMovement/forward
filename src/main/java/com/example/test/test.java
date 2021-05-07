package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = new ArrayList<>();

        int min = Integer.MIN_VALUE;
        for (int i : nums) {
            if (nums[Math.abs(i) - 1] > 0) {
                nums[Math.abs(i) - 1] *= -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                result.add(i);
            }
        }
    }
}

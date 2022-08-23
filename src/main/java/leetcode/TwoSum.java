package main.java.leetcode;

import java.util.LinkedHashMap;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                result[0] = map.get(diff);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}

/*
Problem: Two Sum
Link: https://leetcode.com/problems/two-sum/

Approach:
- Use HashMap to store number and index.
- For each element, check if (target - current) exists.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}

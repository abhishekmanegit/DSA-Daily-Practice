/*
Problem: Two Sum
Link: https://leetcode.com/problems/two-sum/

Approach:
- Use HashMap to store number and index.
- For each element, check if (target - current) exists.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[i] + nums[j] == target ) return new int[]{i,j};
            }
        }
            return new int[]{};
    
    }
}

1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Arrays.sort(nums);
4        for (int i = 0 ; i<nums.length-1;i++) {
5            if (nums[i] == nums[i+1]) {
6                return true;
7            }
8        }return false;
9    } 
10}
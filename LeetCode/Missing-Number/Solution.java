1class Solution {
2    public int missingNumber(int[] nums) {
3      int n = nums.length;
4      int realsum = n*(n+1)/2;
5      int actualsum = 0;
6      for (int i = 0; i<nums.length;i++) {
7        actualsum = actualsum + nums[i];
8
9      } return realsum-actualsum;
10    } 
11}
1        class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3
4        int[] ans = new int[nums.length];
5        for (int i = 0; i < nums.length; i++) {
6            int count = 0;
7            for (int j = 0; j < nums.length; j++) {
8                if (nums[j] < nums[i]) {
9                    count++;
10                }
11            }ans[i] = count;
12            } return ans;
13        }
14    }
15  
16
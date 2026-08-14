1class Solution {
2    public int findPeakElement(int[] nums) {
3
4        if (nums.length == 1) {
5            return 0;
6        }
7        if (nums[0] > nums[1]) {
8            return 0;
9        }
10        if (nums[nums.length - 1] > nums[nums.length - 2]) {
11            return nums.length - 1;
12        }
13        for (int i = 1; i < nums.length - 1; i++) {
14             if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
15                return i;
16            }
17        } return -1;
18    }
19}
1import java.util.*;
2
3class Solution {
4    public long maximumSubarraySum(int[] nums, int k) {
5        Set<Integer> set = new HashSet<>();
6        long sum = 0;
7        long max = 0;
8        int left = 0;
9        for (int right = 0; right < nums.length; right++) {
10            while (set.contains(nums[right])) {
11                set.remove(nums[left]);
12                sum -= nums[left];
13                left++;
14            }
15            set.add(nums[right]);
16            sum += nums[right];
17            if (right - left + 1 > k) {
18                set.remove(nums[left]);
19                sum -= nums[left];
20                left++;
21            }
22            if (right - left + 1 == k) {
23                max = Math.max(max, sum);
24            }
25        }
26        return max;
27    }
28}
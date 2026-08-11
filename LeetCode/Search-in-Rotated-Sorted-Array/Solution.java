1class Solution {
2    public int search(int[] nums, int target) {
3
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left <= right) {
8
9            int mid = left + (right - left) / 2;
10
11            if (nums[mid] == target) {
12                return mid;
13            }
14            if (nums[left] <= nums[mid]) {
15
16                if (nums[left] <= target && target < nums[mid]) {
17                    right = mid - 1;
18                } else {
19                    left = mid + 1;
20                }
21
22            }
23         
24            else {
25
26                if (nums[mid] < target && target <= nums[right]) {
27                    left = mid + 1;
28                } else {
29                    right = mid - 1;
30                }
31            }
32        }
33
34        return -1;
35    }
36}
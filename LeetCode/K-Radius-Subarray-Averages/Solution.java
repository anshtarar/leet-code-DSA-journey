1class Solution {
2    public int[] getAverages(int[] nums, int k) {
3        int n = nums.length, w = 2 * k + 1;
4        int[] ans = new int[n];
5        Arrays.fill(ans, -1);
6
7        if (w > n) return ans;
8
9        long sum = 0;
10        for (int i = 0; i < w; i++) sum += nums[i];
11
12        for (int i = k; i < n - k; i++) {
13            ans[i] = (int)(sum / w);
14            if (i + k + 1 < n)
15                sum += nums[i + k + 1] - nums[i - k];
16        }
17
18        return ans;
19    }
20}
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3     int left = 0;
4     int sum =0;
5     for (int i = 0;i<k;i++) 
6     sum+=nums[i];
7     int max = sum;
8     for (int i =k;i <nums.length;i++) {
9         sum=sum-nums[left++];
10        sum=sum+nums[i];
11        max= Math.max(max,sum);
12     }   
13     return (double)max/k;
14    }
15}
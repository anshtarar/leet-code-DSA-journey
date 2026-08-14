1class Solution {
2    public int maxProduct(int[] nums) {
3        int ans =0;
4        for (int i =0; i<nums.length;i++) {
5            for (int j = i+1;j<nums.length;j++) {
6                int product = (nums[i]-1)*(nums[j]-1);
7                if (product>ans){
8                    ans = product;
9                }
10            }
11        } return ans;
12    }
13}
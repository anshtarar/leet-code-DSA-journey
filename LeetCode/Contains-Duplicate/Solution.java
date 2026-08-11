1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4
5        for (int x : nums)
6            if (!set.add(x))
7                return true;
8
9        return false;
10    }
11}
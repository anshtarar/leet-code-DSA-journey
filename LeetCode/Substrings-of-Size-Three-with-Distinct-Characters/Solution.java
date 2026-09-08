1class Solution {
2    public int countGoodSubstrings(String s) {
3        int count = 0;
4        for (int i = 0; i < s.length() - 2; i++) {
5            if (s.charAt(i) != s.charAt(i + 1) &&
6                s.charAt(i + 1) != s.charAt(i + 2) &&
7                s.charAt(i + 2) != s.charAt(i)) {       
8                count++;
9            }
10        }
11        return count;
12    }
13}
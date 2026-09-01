1class Solution {
2    public int maxVowels(String s, int k) {
3        int count = 0, max = 0;
4        for (int i = 0; i < s.length(); i++) {
5            if ("aeiou".indexOf(s.charAt(i)) != -1)
6                count++;
7            if (i >= k && "aeiou".indexOf(s.charAt(i - k)) != -1)
8                count--;
9            max = Math.max(max, count);
10        }
11        return max;
12    }
13}
1class Solution {
2    public int maxVowels(String s, int k) {
3        int count = 0, max = 0;
4        for (int i = 0; i < s.length(); i++) {
5            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||
6                s.charAt(i)=='o' || s.charAt(i)=='u')
7                count++;
8            if (i >= k) {
9                if (s.charAt(i-k)=='a' || s.charAt(i-k)=='e' || 
10                    s.charAt(i-k)=='i' || s.charAt(i-k)=='o' || 
11                    s.charAt(i-k)=='u')
12                    count--;
13            }
14            if (count > max)
15                max = count;
16        }
17        return max;
18    }
19}
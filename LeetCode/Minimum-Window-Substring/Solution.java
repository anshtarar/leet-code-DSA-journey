1class Solution {
2    public String minWindow(String s, String t) {
3        int[] a = new int[128];
4        for (char c : t.toCharArray()) a[c]++;
5
6        int l = 0, count = t.length(), start = 0, min = Integer.MAX_VALUE;
7
8        for (int r = 0; r < s.length(); r++) {
9            if (a[s.charAt(r)]-- > 0) count--;
10
11            while (count == 0) {
12                if (r - l + 1 < min) {
13                    min = r - l + 1;
14                    start = l;
15                }
16                if (++a[s.charAt(l++)] > 0) count++;
17            }
18        }
19
20        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
21    }
22}
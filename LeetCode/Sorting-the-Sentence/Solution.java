1class Solution {
2    public String sortSentence(String s) {
3        String[] words = s.split(" ");
4        String[] ans = new String[words.length];
5
6        for (int i = 0; i < words.length; i++) {
7            int pos = words[i].charAt(words[i].length() - 1) - '1';
8            ans[pos] = words[i].substring(0, words[i].length() - 1);
9        }
10
11        return String.join(" ", ans);
12    }
13}
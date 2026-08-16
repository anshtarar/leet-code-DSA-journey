1class Solution {
2    public int lengthOfLastWord(String s) {
3       s= s.trim();
4        int count=0;
5        for (int i = s.length()-1;i>=0;i--) {
6            if (s.charAt(i)==' ') 
7                break;
8                count++;
9            
10        }
11        return count;
12    }
13}
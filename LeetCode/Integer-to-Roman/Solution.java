1class Solution {
2    public String intToRoman(int num) {
3        
4        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
5        
6        String[] symbols = {
7            "M", "CM", "D", "CD",
8            "C", "XC", "L", "XL",
9            "X", "IX", "V", "IV", "I"
10        };
11        
12        StringBuilder result = new StringBuilder();
13        
14        for (int i = 0; i < values.length; i++) {
15            while (num >= values[i]) {
16                num -= values[i];
17                result.append(symbols[i]);
18            }
19        }
20        
21        return result.toString();
22    }
23}
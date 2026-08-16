1class Solution {
2    public String defangIPaddr(String address) {
3        return address.replace(".","[.]");
4    }
5}
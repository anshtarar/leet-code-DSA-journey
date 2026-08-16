1class Solution {
2    public String interpret(String command) {
3        command = command.replace("()", "o");
4        command = command.replace("(al)", "al");
5        
6        return command;
7    }
8}
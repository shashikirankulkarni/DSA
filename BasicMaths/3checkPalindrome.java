/*
Problem Statement:  Given a number check if it is a palindrome.

An integer is considered a palindrome when it reads the same backward as forward.

Examples:

Example 1:
Input: N = 123
Output: Not Palindrome Number
Explanation: 123 read backwards is 321.Since these are two different numbers 123 is not a palindrome.

Example 2:
Input: N =  121 
Output: Palindrome Number
Explanation: 121 read backwards as 121.Since these are two same numbers 121 is a palindrome.
*/

class Solution {
    public boolean isPalindrome(int x) {
        
        int original = x;
        int reverse = 0;
        
        while(x>0){
            
            int reminder = x % 10;
            reverse = (reverse * 10) + reminder;
            x = x / 10;
        }
        
        if(reverse == original){
            
            return true;
        }
        return false;
    }
}
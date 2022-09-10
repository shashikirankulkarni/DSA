/*
Problem Statement: Given a number N reverse the number and print it.

Examples:

Example 1:
Input: N = 123
Output: 321
Explanation: The reverse of 123 is 321

Example 2:
Input: N = 234
Output: 432
Explanation: The reverse of 234 is 432

*/

class Solution{


    static int reverseNumber(int N){


        int reverse = 0;

        while(N>0){

            int reminder = N % 10;
            reverse = (reverse * 10) + reminder;
            N = n/10;
        }

        return reverse;


    }
}
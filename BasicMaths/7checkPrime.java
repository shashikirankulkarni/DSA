/*
Example 1:
Input: N = 3
Output: Prime
Explanation: 3 is a prime number

Example 2:
Input: N = 26
Output: Non-Prime
Explanation: 26 is not prime

*/

class Solution{


    static boolean isPrime(int N){

        for(int i=2; i<=Math.sqrt(N); i++){

            if(N%i == 0){

                return false;
            }

            return true;
        }
    }
    static void checkPrime(int n){

        boolean ans = isPrime(n);

        if(n!=1 && ans == true) System.out.print("Prime");
        else System.out.print("Not Prime");

    }
}
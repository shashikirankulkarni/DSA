/*
Example 1:
Input: n = 36
Output: 1 2 3 4 6 9 12 18 36
Explanation: All the divisors of 36 are printed.

Example 2:
Input: n = 97
Output: 1 97
Explanation: Since 97 is a prime number, only 1 and 97 are printed.
*/


class Solution{
    static void printAllDivisors(int N){
        // code here
        
        
        
        for(int i=1; i<=N; i++){
            
            if(N%i ==0){
                
                System.out.print(i+" ");
            }
        }
        
        
    }
}



//or

class Solution{
    static void printAllDivisors(int N){
        // code here
        
        
        
        for(int i=1; i<=Math.sqrt(N); i++){
            
            if(N % i == 0){
                
                System.out.print(i+" ");

                if(i != N/i) System.out.println(N/i);
            }
        }
        
        
    }
}

/*Problem Description
Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….



Problem Constraints
1 <= A <= 5000



Input Format
The only argument given is integer A.



Output Format
Return the Ath magic number.



Example Input
Example Input 1:

 A = 3
Example Input 2:

 A = 10


Example Output
Example Output 1:

 30
Example Output 2:

 650


Example Explanation
Explanation 1:

 Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
 3rd element in this is 30
Explanation 2:

 In the sequence shown in explanation 1, 10th element will be 650. */
package BitManipulations;
public class FindnthMagicNumber {
    public static void main(String[] args) {
        int A = 10;
        int Output = solve(A);
        System.out.println(Output);
    }
    public static int solve(int A) {
        // Convert the given number in Binary
        // Convert the Binary form to the number in base 5
        // Pattern says the first number is 5, so start the position value...
        // (pv) with 5 instead of 1
        int ans = 0;
        int pv = 5;
        while (A > 0){
            int rem = A % 2;
            ans = ans + (rem * pv);
            A = A / 2;
            pv = pv * 5;
        }
        return ans;  
    }      
}

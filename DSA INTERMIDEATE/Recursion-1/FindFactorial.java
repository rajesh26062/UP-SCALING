/*Problem Description
Write a program to find the factorial of the given number A.



Problem Constraints
0 <= A <= 12



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the factorial of the number A.



Example Input
Input 1:

 A = 4
Input 2:

 A = 1


Example Output
Output 1:

 24
Output 2:

 1


Example Explanation
Explanation 1:

 Factorial of 4 = 4 * 3 * 2 * 1 = 24
Explanation 2:

 Factorial of 1 = 1 */
package Recursion1;

public class FindFactorial {
    public static void main(String[] args) {
        int A = 4;
        int Output = solve(A);
        System.out.println(Output);
    }
    public static int solve(int A) {
        return fact(A);
    }
    public static int fact(int A){
        if(A==1){
            return 1;
        }
        else{
            return A*fact(A-1);
        }
    }
}

/*Problem Description
You are given an integer A, print A to 1 using using recursion.



Problem Constraints
1 <= A <= 104



Input Format
First argument A is an integer.



Output Format
Print A space-separated integers A to 1.
Note: There should be exactly one space after each integer. Print a new line after printing the A integers



Example Input
Input 1:

10
Input 2:

5


Example Output
Output 1:

10 9 8 7 6 5 4 3 2 1 
Output 2:

5 4 3 2 1 


Example Explanation
Explanation 1:

Print 10 to 1 space separated integers. */
package Recursion1;

public class PrintAto1function {
    public static void main(String[] args) {
        int A = 10;
        solve(A);
    }
    public static void printAto1(int A){
        if(A == 0){
            return;
        }
        System.out.print(A + " ");
        printAto1(A - 1);
    }
    public static void solve(int A) {
        printAto1(A);
        System.out.print("\n");
    }
}

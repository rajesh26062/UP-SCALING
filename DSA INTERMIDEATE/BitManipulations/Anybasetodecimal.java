/*Problem Description
You are given a number A. You are also given a base B. A is a number on base B.
You are required to convert the number A into its corresponding value in decimal number system.


Problem Constraints
0 <= A <= 109
2 <= B <= 9


Input Format
First argument A is an integer.
Second argument B is an integer.


Output Format
Return an integer.


Example Input
Input 1:
A = 1010
B = 2
Input 2:
A = 22 
B = 3


Example Output
Output 1:
10
Output 2:
8


Example Explanation
For Input 1:
The decimal 10 in base 2 is 1010.
For Input 2:
The decimal 8 in base 3 is 22.*/
package BitManipulations;

public class Anybasetodecimal {
    public static void main(String[] args) {
        int A = 1010;
        int B = 2;
        int Output = solve(A, B);
        System.out.println(Output);
    }
    public static int solve(int A, int B) {
        int decimal = 0 ; 
        int power = 0 ; 
        while(A > 0 ){
            int reminder = A%10 ; 
            decimal += reminder*Math.pow(B,power);
            power++;
            A = A/10;
        }
        return decimal;
    }
}

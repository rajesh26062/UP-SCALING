/*Problem Description
Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).

Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.



Problem Constraints
-109 <= A <= 109
0 <= B <= 109
1 <= C <= 109


Input Format
Given three integers A, B, C.


Output Format
Return an integer.


Example Input
A = 2, B = 3, C = 3


Example Output
2


Example Explanation
23 % 3 = 8 % 3 = 2 */
package recursion;

public class ImplementPowerFunction {
    public static void main(String[] args) {
        int A = 2;
        int B = 3 ; 
        int C = 3;
        int Output = pow(A, B, C);
        System.out.println(Output);
    }
    public static int pow(int A, int B, int C) {
        if(A == 0)
            return 0;
        if(B == 0)
            return 1;
        long ans = pow(A, B / 2, C);
        ans = (ans * ans) % C;
        if(B % 2 == 1)
            ans = (ans * A);
        ans = (ans + C) % C;
        return (int)ans;
    }

}

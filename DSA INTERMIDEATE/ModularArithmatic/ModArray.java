/*Problem Description
You are given a large number in the form of a array A of size N where each element denotes a digit of the number.
You are also given a number B. You have to find out the value of A % B and return it.



Problem Constraints
1 <= N <= 105
0 <= Ai <= 9
1 <= B <= 109


Input Format
The first argument is an integer array A.
The second argument is an integer B.


Output Format
Return a single integer denoting the value of A % B.


Example Input
Input 1:
A = [1, 4, 3]
B = 2
Input 2:

A = [4, 3, 5, 3, 5, 3, 2, 1]
B = 47


Example Output
Output 1:
1
Output 2:

20


Example Explanation
Explanation 1:
143 is an odd number so 143 % 2 = 1.
Explanation 2:

43535321 % 47 = 20 */
package ModularArithmatic;
public class ModArray {
    public static void main(String[] args) {
        int [] A = {1,4,3};
        int B = 2;
        int Output = solve(A, B);
        System.out.println(Output);
    }
    public static int solve(int[] A, int B) {
        long ans = 0;
        long mod = B;
        int n = A.length;
        long curr = 1;
        for(int i = n - 1; i >= 0; i--){
            long dig = A[i];
            long term = (dig * curr) % mod;
            ans = (ans + term) % mod;
            curr = (curr * 10) % mod;
        }
        return (int)ans;
    }
}
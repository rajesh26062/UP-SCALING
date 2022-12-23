/*Problem Description

Given an one-dimensional unsorted array A containing N integers.

You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.

Return 1 if any such pair exists else return 0.



Problem Constraints

1 <= N <= 105
-103 <= A[i] <= 103
-105 <= B <= 105


Input Format

First argument is an integer array A of size N.

Second argument is an integer B.



Output Format

Return 1 if any such pair exists else return 0.



Example Input

Input 1:

 A = [5, 10, 3, 2, 50, 80]
 B = 78
Input 2:

 A = [-10, 20]
 B = 30


Example Output

Output 1:

 1
Output 2:

 1


Example Explanation

Explanation 1:

 Pair (80, 2) gives a difference of 78.
Explanation 2:

 Pair (20, -10) gives a difference of 30 i.e 20 - (-10) => 20 + 10 => 30 */
 import java.util.*;;
public class PairWithGivenDifference {
    public static void main(String[] args) {
        int[]A = {5, 10, 3, 2, 50, 80};
        int B = 78;
        int Output= solve(A, B);
        System.out.println(Output);
    }
    public static int solve(int[] A, int B) {

        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<A.length; i++) {

            if (set.contains(A[i] - B)) {
                return 1;
            }

            if (set.contains(A[i] + B)) {
                return 1;
            }

            set.add(A[i]);
        }

        return 0;
    }
}

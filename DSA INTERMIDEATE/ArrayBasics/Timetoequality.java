/*Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.


Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000


Input Format
First argument is an integer array A.


Output Format
Return an integer denoting the minimum time to make all elements equal.


Example Input
A = [2, 4, 1, 3, 2]


Example Output
8


Example Explanation
We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
*/
package ArrayBasics;

public class Timetoequality {
    public static int solve(int[] A) {
        int max = 0;
        int sum = 0;
        for(int element: A){
            sum+=element;
            if(element>max) max=element;
        }
        int maxSum = max*A.length;
        return maxSum-sum;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int output = solve(A);
        System.out.println(output);
    }
}

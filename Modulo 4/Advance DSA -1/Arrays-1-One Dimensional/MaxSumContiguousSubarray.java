//package Advance DSA.ArraysOneDimensional;
/*Problem Description
Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.



Problem Constraints
1 <= N <= 1e6
-1000 <= A[i] <= 1000



Input Format
The first and the only argument contains an integer array, A.



Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input
Input 1:

 A = [1, 2, 3, 4, -10] 
Input 2:

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 


Example Output
Output 1:

 10 
Output 2:

 6 


Example Explanation
Explanation 1:

 The subarray [1, 2, 3, 4] has the maximum possible sum of 10. 
Explanation 2:

 The subarray [4,-1,2,1] has the maximum possible sum of 6. 
 * 
 */
public class MaxSumContiguousSubarray {
    public static void main(String[] args) {
      int [] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
      int Output = maxSubArray(A);
      System.out.println(Output);
    }
    public static int maxSubArray(final int[] A) {
        int ans  = A[0], sum = 0;
        for(int i=0; i<A.length;i++){
            sum = A[i] + Math.max(sum,0);
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}

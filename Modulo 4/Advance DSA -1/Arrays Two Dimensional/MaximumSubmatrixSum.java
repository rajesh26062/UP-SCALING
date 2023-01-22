/*Problem Description
Given a row-wise and column-wise sorted matrix A of size N * M.
Return the maximum non-empty submatrix sum of this matrix.


Problem Constraints
1 <= N, M <= 1000
-109 <= A[i][j] <= 109


Input Format
The first argument is a 2D integer array A.


Output Format
Return a single integer that is the maximum non-empty submatrix sum of this matrix.


Example Input
Input 1:-
    -5 -4 -3
A = -1  2  3
     2  2  4
Input 2:-
    1 2 3
A = 4 5 6
    7 8 9


Example Output
Output 1:-
12
Output 2:-
45


Example Explanation
Expanation 1:-
The submatrix with max sum is 
-1 2 3
 2 2 4
 Sum is 12.
Explanation 2:-
The largest submatrix with max sum is 
1 2 3
4 5 6
7 8 9
The sum is 45. */
public class MaximumSubmatrixSum {
    public static void main(String[] args) {
        int [][]A = {{-5,-4,-3},{-1,2,3},{2,2,4}};
        long Output = solve(A);
        System.out.println(Output);
    }
    public static long[][] prefixMatrixSum(int[][] A){
        int n = A.length, m = A[0].length;
        long preSum[][] = new long[n + 1][m + 1];
        // preSum[i][j] denotes the sum of elements of matirx (0, 0) to (i, j)
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= m; j++){
                preSum[i][j] = A[i - 1][j - 1] + preSum[i - 1][j] + 
                                preSum[i][j - 1] - preSum[i - 1][j - 1];
            }
        }
        return preSum;
    }
    public static long solve(int[][] A) {
        long[][] preSum = prefixMatrixSum(A);
        int n= A.length, m= A[0].length;
        long max = preSum[n][m];
        for(int rs = 0; rs<n; rs++){
            for(int cs=0; cs<m; cs++){
                long sum = preSum[n][m];
                    sum-= preSum[rs][m];
                    sum-= preSum[n][cs];
                    sum+= preSum[rs][cs];
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}

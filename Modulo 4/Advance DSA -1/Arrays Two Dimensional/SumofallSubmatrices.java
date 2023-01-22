/*Problem Description
Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.



Problem Constraints
1 <= N <=30

0 <= A[i][j] <= 10



Input Format
Single argument representing a 2-D array A of size N x N.



Output Format
Return an integer denoting the sum of all possible submatrices in the given matrix.



Example Input
A = [ [1, 1]
      [1, 1] ]


Example Output
16


Example Explanation
Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
Number of submatrices with 3 elements = 0
Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
Total Sum = 4+8+4 = 16 */

public class SumofallSubmatrices {
    public static void main(String[] args) {
        int [][]A = {{1,1},{1,1}};
        int Output = solve(A);
        System.out.println(Output);
    }
    public static int solve(int[][] A) {
        // we will calculate the occurance of all the elements first
        // then for each element we will multiply them and add it.
        int allSubArrSum = 0, n=A[0].length, m=A.length;
        for(int i=0; i<A[0].length; i++){
            for(int j=0; j<A.length; j++){
                // calculating occurance of each element
                int occurance = (i+1)*(n-i)*(j+1)*(m-j);
                // multiplying occurance with the element value and adding to Sum
                allSubArrSum += occurance*A[i][j];
            }
        }
        return allSubArrSum;
    }
}

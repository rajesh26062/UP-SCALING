/*Problem Description
You are given a n x n 2D matrix A representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note: If you end up using an additional array, you will only receive partial score.



Problem Constraints
1 <= n <= 1000



Input Format
First argument is a 2D matrix A of integers



Output Format
Return the 2D rotated matrix.



Example Input
Input 1:

 [
    [1, 2],
    [3, 4]
 ]
Input 2:

 [
    [1]
 ]


Example Output
Output 1:

 [
    [3, 1],
    [4, 2]
 ]
Output 2:

 [
    [1]
 ]


Example Explanation
Explanation 1:

 After rotating the matrix by 90 degree:
 1 goes to 2, 2 goes to 4
 4 goes to 3, 3 goes to 1
Explanation 2:

 2D array remains the ssame as there is only element.*/
package Array2DMatrix;

public class RotateMatrix {
    public static void main(String[] args) {
        int [][]A = {{1,2},{3,4}};
        int [][]Output = solve(A);
        for (int i = 0; i < Output.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < Output[i].length; j++) { //this equals to the column in each row.
               System.out.print(Output[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
         }
    }
    public static int[][] solve(int[][] A) {
        // In place transpose
        // iterate through upper triangle and swap
        for(int r = 0 ; r < A.length-1 ; r ++){ // col
            for(int c = r+1 ; c <A.length ; c ++){ //row
                int temp = A[c][r];
                A[c][r] = A[r][c];
                A[r][c] = temp;
            }   
        }
        // swaping the columns
        for(int c = 0; c<A.length/2;c++){
            for(int r = 0;r < A.length;r++){
                int temp = A[r][c];
                A[r][c] = A[r][A.length-c-1];
                A[r][A.length-c-1] = temp;
            }
        }
        return A;
    }
}

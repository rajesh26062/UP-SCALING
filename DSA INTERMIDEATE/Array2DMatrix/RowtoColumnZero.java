/*Problem Description
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.



Problem Constraints
1 <= A.size() <= 103

1 <= A[i].size() <= 103

0 <= A[i][j] <= 103



Input Format
First argument is a vector of vector of integers.(2D matrix).



Output Format
Return a vector of vector after doing required operations.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,0]
[9,2,0,4]


Example Output
Output 1:

[1,2,0,0]
[0,0,0,0]
[0,0,0,0]


Example Explanation
Explanation 1:

A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.*/
package Array2DMatrix;

public class RowtoColumnZero {
    public static void main(String[] args) {
        
        int [][] A = {{1,2,3,4},
                      {5,6,7,0},
                      {9,2,0,4}};
                      
        int [][]Output = solve(A);
        for (int i = 0; i < Output.length; i++) {
            for (int j = 0; j < Output[i].length; j++) { 
                System.out.print(Output[i][j] + " ");
                 }
                System.out.println(); 
            }          
    }
    public static int[][] solve(int[][] A) {
        int[] rowFlag = new int[A.length];
        int[] colFlag = new int[A[0].length];
        for(int r = 0; r<A.length;r++){
           for(int c = 0; c<A[0].length; c++){
               if(A[r][c]== 0){
                   rowFlag[r] = 1;
                   colFlag[c] = 1;
                }
            }
        }
        for(int i =0; i<rowFlag.length; i++){
            if(rowFlag[i]==1){
                for(int r = 0; r<A.length;r++){
                    A[i][r] = 0;
                }
            }
        }
        for(int i =0; i<colFlag.length; i++){
            if(colFlag[i]==1){
                for(int c = 0; c<=A[0].length;c++){
                    A[c][i] = 0;
                }
            }
        }
        return A;
    }
}

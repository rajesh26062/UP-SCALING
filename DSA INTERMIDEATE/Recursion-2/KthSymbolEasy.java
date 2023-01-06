package Recursion;

/* 
Problem Description
On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).



Problem Constraints
1 <= A <= 20

0 <= B < 2A - 1



Input Format
First argument is an integer A.

Second argument is an integer B.



Output Format
Return an integer denoting the Bth indexed symbol in row A.



Example Input
Input 1:

 A = 3
 B = 0
Input 2:

 A = 4
 B = 4


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 Row 1: 0
 Row 2: 01
 Row 3: 0110
Explanation 2:

 Row 1: 0
 Row 2: 01
 Row 3: 0110
 Row 4: 01101001
  */
//package Recursion
public class KthSymbolEasy {
    public static void main(String[] args) {
        int A = 3;
        int B = 0;
        int Output = solve(A, B);
        System.out.println(Output);
    }
    public static int solve(int A, int B) {
        // This is the first row -->> 0
        StringBuilder firstRow = new StringBuilder("0");
        // Getting the Ath row from helper function
        StringBuilder finalRow = new StringBuilder (helper(firstRow,A-1));
        // converting the Bth element of Ath row to integer
        int ele = finalRow.charAt(B)-'0' ;
        // returning the answer
        return ele;
    }
    public static StringBuilder helper(StringBuilder str,int rows){
        // If its last row then return
        if(rows == 0){
            //System.out.println(str+" "+rows);
            return str;
        } 
        else{
            // creating a new SB variable - representing a new row
            StringBuilder newStr = new StringBuilder("");
            // For each element in previous row 
            for(int i=0;i<str.length();i++){
                // if it is 0 then add 01 in new row
                if(str.charAt(i)=='0'){
                    newStr.append("01");
                }
                // if its 1 then add 10 in new row
                else{
                    newStr.append("10");
                }
            }
            // calling itself with New String and reduced row count as input
            return helper(newStr,rows-1);
        }

    }
}

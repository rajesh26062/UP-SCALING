/*
Problem Description
You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.



Problem Constraints
1 <= length(A) <= 105



Input Format
First and only argument is a string A.



Output Format
Return an integer denoting the answer.



Example Input
Input 1:

 A = "ABCGAG"
Input 2:

 A = "GAB"


Example Output
Output 1:

 3
Output 2:

 0


Example Explanation
Explanation 1:

 Subsequence "AG" is 3 times in given string 
Explanation 2:

 There is no subsequence "AG" in the given string.

*/
package ArrayCarryForward;

/**
 * SpecialSubSeq
 */
public class SpecialSubSeq {

    public static void main(String[] args) {
        System.out.println(solve("ABCGAG"));
    }
    public static int solve(String A) {
        int cntG = 0;
        int cntnumberOfSubSeq = 0;
        for( int index = A.length()-1; index>=0; index--){
            //if(A.charAt(index) == 'A' && cntG==0 ) continue;
            if(A.charAt(index) =='G') cntG++;
            else if(A.charAt(index) == 'A'&& cntG!=0) cntnumberOfSubSeq = cntnumberOfSubSeq%1000000007 +cntG%1000000007;
        }
        return cntnumberOfSubSeq%1000000007 ;
    }
}

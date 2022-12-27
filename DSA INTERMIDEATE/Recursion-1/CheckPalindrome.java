/*Problem Description
Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.

Note: A palindrome is a string that's the same when read forward and backward.



Problem Constraints
1 <= |A| <= 50000

String A consists only of lowercase letters.



Input Format
The first and only argument is a string A.



Output Format
Return 1 if the string A is a palindrome, else return 0.



Example Input
Input 1:

 A = "naman"
Input 2:

 A = "strings"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 "naman" is a palindomic string, so return 1.
Explanation 2:

 "strings" is not a palindrome, so return 0. */
package Recursion1;

public class CheckPalindrome {
    public static void main(String[] args) {
        String A = "naman";
        int Output = solve(A);
        System.out.println(Output);
    }
    public static boolean checksPlndrm(String A,int l,int r){
        if(l>=r) return true;
        else if(A.charAt(l)!=A.charAt(r))
        return false;
        return checksPlndrm(A,++l,--r);
    }
    public static int solve(String A) {
        int start=0, end =A.length()-1;
        if(checksPlndrm(A,start,end))
        return 1;
        else return 0;
    }
}

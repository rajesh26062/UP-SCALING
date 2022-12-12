/*Problem Description

You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.



Problem Constraints

1 <= N <= 105

A[i] ∈ ['a'-'z', 'A'-'Z']



Input Format

First and only argument is a character string A.



Output Format

Return a character string.



Example Input

Input 1:

 A = "Hello" 
Input 2:

 A = "tHiSiSaStRiNg" 


Example Output

Output 1:

 hELLO 
Input 2:

 ThIsIsAsTrInG 


Example Explanation

Explanation 1:

 'H' changes to 'h'
 'e' changes to 'E'
 'l' changes to 'L'
 'l' changes to 'L'
 'o' changes to 'O'
Explanation 2:

 "tHiSiSaStRiNg" changes to "ThIsIsAsTrInG". */
package String;

public class ToggleCase {
    public static void main(String[] args) {
        String A = "tHiSiSaStRiNg";
        String Output = solve(A);
        System.out.println(Output);
    }
    public static String solve(String A) {
        int N = A.length();
        // converting string to char array
        char[] charArr = A.toCharArray();
        // toogle code
        for(int i = 0; i < N ; i ++){
            //if small 
            if(charArr[i]>='a'&& charArr[i]<='z'){
                charArr[i]=(char)(charArr[i]-32);
            }
            //if capital
            else{
                charArr[i]=(char)(charArr[i]+32);
            }
        }
        //converting Char array to String
        String string = new String(charArr);
        return string;  
    }
}

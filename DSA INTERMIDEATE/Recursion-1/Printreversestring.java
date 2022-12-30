/*Problem Description
Write a recursive function that, given a string S, prints the characters of S in reverse order.



Problem Constraints
1 <= |s| <= 1000



Input Format
First line of input contains a string S.



Output Format
Print the character of the string S in reverse order.



Example Input
Input 1:

 scaleracademy
Input 2:

 cool


Example Output
Output 1:

 ymedacarelacs
Output 2:

 looc


Example Explanation
Explanation 1:

 Print the reverse of the string in a single line. */
//import java.lang.*;

package Recursion1;
import java.util.*;
//import java.lang.*;
public class Printreversestring {
    public static void solve(String s){
        if(s.length() == 0){
            return;
        }
        solve(s.substring(1));
        System.out.print(s.charAt(0));
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        solve(str);
    }
}

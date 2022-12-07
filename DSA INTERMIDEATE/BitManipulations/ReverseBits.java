/*Problem Description
Reverse the bits of an 32 bit unsigned integer A.



Problem Constraints
0 <= A <= 232



Input Format
First and only argument of input contains an integer A.



Output Format
Return a single unsigned integer denoting the decimal value of reversed bits.



Example Input
Input 1:

 0
Input 2:

 3


Example Output
Output 1:

 0
Output 2:

 3221225472


Example Explanation
Explanation 1:

        00000000000000000000000000000000    
=>      00000000000000000000000000000000
Explanation 2:

        00000000000000000000000000000011    
=>      11000000000000000000000000000000 */
package BitManipulations;
import java.util.*;
public class ReverseBits {
    public static void main(String[] args) {
        long a = 3;
        long Output = reverse(a);
        System.out.println(Output);
    }
    public static long reverse(long a) {
        // ArrayList<int> arr = new ArrayList<>();
        ArrayList<Integer> arr
            = new ArrayList<Integer>();
        while(a>0){
            if((a&1)==1) arr.add(1);
            else{arr.add(0);}
            a=a>>1;
        }
        long op = 0;
        for(int i=0; i<arr.size();i++){
            op=op<<1;
            op = op|arr.get(i);
        }
        op = op<<(32-arr.size());
        return op;
    }
}

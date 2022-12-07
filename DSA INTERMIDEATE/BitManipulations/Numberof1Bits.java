/*Problem Description
Write a function that takes an integer and returns the number of 1 bits it has.


Problem Constraints
1 <= A <= 109


Input Format
First and only argument contains integer A


Output Format
Return an integer as the answer


Example Input
Input 1:
11
Input 2:
6


Example Output
Output 1:
3
Output 2:
2


Example Explanation
Explaination 1:
11 is represented as 1011 in binary.
Explaination 2:
6 is represented as 110 in binary. */
package BitManipulations;
public class Numberof1Bits {
    public static void main(String[] args) {
        int A = 11 ;
        int Output = numSetBits(A);
        System.out.println(Output);
    }
    public static int numSetBits(int A) {
        int count = 0 ,shift =1,a=A; 

        while(a>0){
            if((a&1)==1) count++;
            a=a>>1;
        } 
        return count;
    }
}

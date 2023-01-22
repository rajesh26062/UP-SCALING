import java.util.Arrays;

/*Problem Description
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :

Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


Problem Constraints
1 <= size of the array <= 1000000



Input Format
First argument is an array of digits.



Output Format
Return the array of digits after adding one.



Example Input
Input 1:

[1, 2, 3]


Example Output
Output 1:

[1, 2, 4]


Example Explanation
Explanation 1:

Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124. */
public class AddOneToNumber {
    public static void main(String[] args) {
        int [] A = {1,2,3};
        int [] Output = plusOne(A);
        System.out.println(Arrays.toString(Output));
    }
    public static int[] plusOne(int[] A) {
        if(A.length==1 && A[0]==0){
            int[] out ={1};
            return out;
        }
        // checking number of leading zeros
        int leadingZeros = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]>0){break;}
            else{leadingZeros++;}
        }
        int carry = 1;
        for(int i=A.length-1;i>=0;i--){
            if(A[i]+carry ==10){
                carry=1;
                A[i] = 0;
            }
            else{
                A[i]+=carry;
                carry = 0;
                break;
            }
        }
        // no new most significant digit is added
        if(carry==0){
            int[] out = new int[A.length-leadingZeros];
            for(int i=leadingZeros,j=0;i<A.length;i++,j++){
                out[j] = A[i];
            }
            return out;
        }
        // most significant digit added to the number
        else{
            int[] out = new int[A.length-leadingZeros+1];
            out[0]=1;
            for(int i=leadingZeros,j=1;i<A.length;i++,j++){
                out[j] = A[i];
            }
            return out;
        }
    }
}

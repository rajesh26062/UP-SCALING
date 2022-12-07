/*Problem Description
Given a decimal number A and base B.
You are required to change the decimal number A into the corresponding value in base B and return that.

Problem Constraints
0 <= A <= 512
2 <= B <= 10


Input Format
The first argument will be decimal number A.
The second argument will be base B.


Output Format
Return the conversion of A in base B.


Example Input
Input:
A = 4
B = 3


Example Output
Output:
11


Example Explanation
Explanation:
Decimal number 4 in base 3 is 11.*/ 
package BitManipulations;
public class DecimaltoAnyBase {
    public static void main(String[] args) {
        int A = 4 ; 
        int B = 3;
        int Output = DecimalToAnyBase(A, B);
        System.out.println(Output);
    }
    public static int DecimalToAnyBase(int A, int B) {
        int answer = 0 ; 
        int power = 0 ; 
        while(A>0){
            int reminder = A%B;
            answer += reminder*Math.pow(10,power);
            power++;
            A=A/B;
        }
        return answer; 
     }
}

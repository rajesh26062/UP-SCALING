/*Problem Description
Given an array B of length A with elements 1 or 0. Find the number of subarrays such that the bitwise OR of all the elements present in the subarray is 1.


Problem Constraints
1 <= A <= 105


Input Format
The first argument is a single integer A.
The second argument is an integer array B.


Output Format
Return the number of subarrays with bitwise array 1.


Example Input
Input 1:
 A = 3
B = [1, 0, 1]
Input 2:
 A = 2
B = [1, 0]


Example Output
Output 1:
5
Output2:
2


Example Explanation
Explanation 1:
The subarrays are :- [1], [0], [1], [1, 0], [0, 1], [1, 0, 1]
Except the subarray [0] all the other subarrays has a Bitwise OR = 1
Explanation 2:
The subarrays are :- [1], [0], [1, 0]
Except the subarray [0] all the other subarrays has a Bitwise OR = 1 */
package BitManipulations;

public class SubarrayswithBitwiseOR1 {
    public static void main(String[] args) {
        int A = 3 ;
        int [] B = {1,0,1};
        long Output = solve(A, B);
        System.out.println(Output);
    }
    public static long solve(int A, int[] B) {
        long cnt = 0;
        for(int i = 0 ; i < A ;i ++){
            int idx = B[i];
            if(idx == 1)  {//if first element is 1 then OR of whole 
            // subarray will be 1
                cnt+=(A-i);
                continue;// we will skip looping for other elements
            }
            for(int j = i+1 ; j < A ; j ++){
                // taking OR for every element as soon as it comes 1
                // we will take count of all the subarray after that
                idx = idx|B[j];
                if(idx==1){
                    cnt+= (A-j);
                    break;
                }
            }
        }
       return cnt;  
    }
}

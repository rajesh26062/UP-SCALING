/*Problem Description
Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Problem Constraints
1 <= n <= 105
-105 <= A[i] <= 105


Input Format
First argument contains an array A of integers of size N


Output Format
Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Example Input
Input 1:
A=[2, 1, 6, 4]
Input 2:

A=[1, 1, 1]


Example Output
Output 1:
1
Output 2:

3


Example Explanation
Explanation 1:
Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. 
Therefore, the required output is 1. 
Explanation 2:

Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Therefore, the required output is 3.*/
package Arrays_Interview_Problems_2;
//import java.util.*;
public class SpecialIndex {
    public static void main(String[] args) {
        int [] A = {2, 1, 6, 4};
        int output = solve(A);
        System.out.println(output);
    }
    public static int solve(int[] A) {
        int[] evenpf = new int[A.length];
        int[] oddpf = new int[A.length];
        evenpf[0]= A[0];
        oddpf[0]=0;
        for(int i = 1 ; i < A.length ; i ++){
            if(i%2 ==0){
                evenpf[i] = evenpf[i-1] +A[i];
                oddpf[i] = oddpf[i-1];
            }
            else{
                oddpf[i] = oddpf[i-1]+A[i];
                evenpf[i] = evenpf[i-1];
            }
        }
        if(evenpf[A.length-1]+oddpf[A.length-1] == 0) return A.length;
        int cntSplIdx = 0;
        for(int i = 1; i<A.length-1;i++){
            if(i%2==0){
                if((evenpf[i-1]+oddpf[A.length-1]-oddpf[i])==
                    (oddpf[i]+evenpf[A.length-1]-evenpf[i])){
                        cntSplIdx++;
                    }
            }
            else{
                if((oddpf[i-1]+evenpf[A.length-1]-evenpf[i])==
                    (evenpf[i]+oddpf[A.length-1]-oddpf[i])){
                        cntSplIdx++;
                    }
            }
        }
        return cntSplIdx;
    }
}

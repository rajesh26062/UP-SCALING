/* 
Problem Description
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.


Problem Constraints
1 <= |A| <= 105

0 <= A[i] <= 109



Input Format
The first argument is an integer array A.



Output Format
Return the second largest element. If no such element exist then return -1.



Example Input
Input 1:

 A = [2, 1, 2] 
Input 2:

 A = [2]


Example Output
Output 1:

 1 
Output 2:

 -1 


Example Explanation
Explanation 1:

 First largest element = 2
 Second largest element = 1
Explanation 2:

 There is no second largest element in the array.
*/

package ArrayBasics;

public class SecondLargest {
    public static  int solve(int[] A) {
        if(A.length==1) return -1;
        int max = A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                //secondMax=max;
                max=A[i];
            }
        }
        int secondMax=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==max)continue;
            if(A[i]>secondMax){
                //secondMax=max;
                secondMax=A[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 7, 8, 9};
        int output = solve(array);
        System.out.println(output);
    }
}

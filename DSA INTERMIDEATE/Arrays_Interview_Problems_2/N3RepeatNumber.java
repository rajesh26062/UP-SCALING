/*Problem Description
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.



Problem Constraints
1 <= N <= 7*105
1 <= A[i] <= 109


Input Format
The only argument is an integer array A.


Output Format
Return an integer.


Example Input
[1 2 3 1 1]


Example Output
1


Example Explanation
1 occurs 3 times which is more than 5/3 times.*/
package Arrays_Interview_Problems_2;

public class N3RepeatNumber {
    public static void main(String[] args) {
        int [] A = {1,2,3,1,1};
        int Output = repeatedNumber(A);
        System.out.println(Output);
    }
    // public static int repeatedNumber(int[] A) {
    //     int n = A.length;
    //     int count1 = 0, count2 = 0;
    //     int first =  Integer.MIN_VALUE;;
    //     int second = Integer.MAX_VALUE;
     
    //     for (int i = 0; i < n; i++) {
    //         if (first == A[i])
    //             count1++;
    //         else if (second == A[i])
    //             count2++;
    //         else if (count1 == 0) {
    //             count1++;
    //             first = A[i];
    //         }
    //         else if (count2 == 0) {
    //             count2++;
    //             second = A[i];
    //         }
    //         else {
    //             count1--;
    //             count2--;
    //         }
    //     }
     
    //     count1 = 0;
    //     count2 = 0;
     
    //     for (int i = 0; i < n; i++) {
    //         if (A[i] == first)
    //             count1++;
    //         else if (A[i] == second)
    //             count2++;
    //     }
     
    //     if (count1 > n / 3)
    //         return first;
     
    //     if (count2 > n / 3)
    //         return second;
     
    //     return -1;
    // }
   
    public static int repeatedNumber(int[] A) {
        if(A.length==1) return A[0];
        int countfirst = 1;
        int majorityElement1 = A[0];
        int countSecond = 1;
        int majorityElement2 = A[1];
        for(int i = 2;i<A.length;i+=2){
            if(countfirst>0 && A[i]==majorityElement1){
                countfirst++;
                continue;
            }
            if(countSecond>0 && A[i]==majorityElement2){
                countSecond++;
                continue;
            }
            if(countfirst==0){
                countfirst++;
                majorityElement1=A[i];
                continue;
            }
            if(countSecond==0){
                countSecond++;
                majorityElement2=A[i];
                continue;
            }
            if(A[i]!=majorityElement1 && A[i]!=majorityElement2){
                countfirst--;
                countSecond--;
                
            } 
        }
        if(countfirst>=countSecond) {
            int cnt = 0;
            for(int i=0; i<A.length;i++){
                if(A[i]==majorityElement1)cnt++;
            }
            if((float)cnt>(float)A.length/3) return majorityElement1;
        }
        else {
            int cnt = 0;
            for(int i=0; i<A.length;i++){
                if(A[i]==majorityElement2)cnt++;
            }
            if((float)cnt>(float)A.length/3) return majorityElement2;
            
        }
        return -1;  
    }

}

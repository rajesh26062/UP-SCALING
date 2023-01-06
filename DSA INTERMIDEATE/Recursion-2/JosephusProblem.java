/*Problem Description
Given the total number of person A and a number B which indicates that B-1 persons are skipped and the Bth person is killed in a circle. Find the last person standing in the circle.


Problem Constraints
1 <= A <= 104
2 <= B <= A



Input Format
First argument A is an integer.
Second argument B is an integer.


Output Format
Return an integer.


Example Input
Input 1:
A = 4
B = 2
Input 2:
A = 5
B = 3


Example Output
Output 1:
1
Output 2:
4


Example Explanation
For Input 1:
Firstly, the person at position 2 is killed, then the person at position 4 is killed,
then the person at position 3 is killed. So the person at position 1 survives. 
For Input 2:
Firstly, the person at position 3, then the person at position 1 is killed, 
then the person at position 5 is killed. Finally, the person at position 2 is killed. 
So the person at position 4 survives.  */
package Recursion;
import java.util.*;
public class JosephusProblem {
    public static void main(String[] args) {
        int A = 4;
        int B = 2;
        int Output = solve(A, B);
        System.out.println(Output);
    }
    public static int solve(int A, int B) {
        int originalB = B;
        ArrayList<Integer> persons = new ArrayList<Integer>();
        int number = 1;
        for(int i = 0; i< A; i++){
            persons.add(number++);
        }
        if(B>persons.size()){
            while(B>persons.size()){
                B = persons.size()-B;
            }
        }
        return josephus(B, persons, originalB);
    }
    public static int josephus(int positiontoKill, ArrayList<Integer> alive, int B){
        if(alive.size()==1){
            return alive.get(0);
        }
        alive.remove(positiontoKill-1);
        int newpostion = positiontoKill+B-1;
        if(newpostion>alive.size()){
            while(newpostion>alive.size()){
                newpostion = Math.abs(alive.size()-newpostion);
            }
        }
        return josephus(newpostion, alive, B);
    }
}

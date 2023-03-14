/* VARIABLE PRACTICE QUESTION 4


Declare two variables as a and b. Initialize the values those variables as 1042 and 7 respectively.

Declare another two variables quo and rem that will store the quotient and remainder of these numbers taking a as dividend and b as divisor.

Print quo and rem in a line separated by a space.

Input Format
No input. User has to declare the variables themselves.

Output Format
Print the quotient and remainder of these numbers by taking a as dividend and b as divisor.

Output:

148 6
 */


import java.io.*;
import java.util.*;

//class Solution {
 //   public void divide(){
        // Your code here. Declare the variables and print the output here.
  ///  }
//}

public class VariablePracticeQuestion4 {
    public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a  = 1042;
		int b = 7;
		int quo = a/b;
		int rem = a%b;
		System.out.print(quo+" "+ rem);
		//System.out.print(rem);
       // Solution Obj = new Solution();
       // Obj.divide();      
       /// System.out.println('\n');
    }
}
/* Variable Practice Question 2
Declare a variable of type float named var and initialize its value to 10.45

After that re-initialize its value to 20.55 and print the variable var

Input Format
There is no input in this question

Output Format
Print value of variable var

Example 1
Input

No Input
Output

20.55 */


import java.io.*;
import java.util.*;

public class VariablePracticeQuestion2 {
    public static void main(String args[]) {
        // your code here
		Scanner sc = new Scanner(System.in);
		float val = 10.45f;
		val = 20.55f;
		System.out.println(val);
    }
}
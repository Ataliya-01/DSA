/* VARIABLE PRACTICE QUESTION 1


Declare a variable named var and assign it a value of 10. Then print the string “My num is ” (without quotes) followed by the value stored in the variable.

Input Format
No input.

Output Format
Print the string “My num is ” followed by the value stored in the variable.

Output:

My num is 10 

*/



import java.io.*;
import java.util.*;

public class MainJava {
    public static void main(String args[]) {
        // your code here
		Scanner sc = new Scanner(System.in);
		int var = 10;
		System.out.println("My num is " +var);
    }
}
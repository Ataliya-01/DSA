/* Print Character Pattern

You are given a number N. Print a pattern consisting of N rows, where the first row has 1 A, the second row has 2 Bs, and so on for N letters. Check the examples for a better understanding.

Input Format
First line of input contains N, the number of rows for the pattern

Output Format
You need to print the pattern.

Example 1
Input

4
Output:

Pattern Image

Explanation:

For number of rows to be 4 we get this output.

Example 2
Input

5
Output:

Pattern Image

Explanation:

For number of rows to be 5 we get this output.
 */
 
 
 
import java.util.*;

public class PrintCharacterPattern
 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio A=new Accio();
        A.pattern(n);
    }
}

class Accio
{
    public void pattern(int n)
    {
       for(int i = 0; i<n; i++){
		   for(int j = 0;  j<=i; j++){
			   System.out.print((char)(65 + i));  
		   }
		   System.out.println();
	   }
    }
}    

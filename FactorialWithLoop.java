/* FACTORIAL WITH LOOP
m Note: Factorial of any given number n is represented as n! = n * n-1 * n-2 .....* 1.

Input Format
The first line consists of a single integer denoting n.

Output Format
Output is a single line containing factorial of n.

Example 1
Input:

5
Output:

120
Explanation:

5! = 5*4*3*2*1 = 120.
Example 2
Input:

4
Output:

24
Explanation:

4! = 4*3*2*1 = 24.

 */


import java.util.*;
import java.lang.*;
import java.io.*;

public class FactorialWithLoop
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		long fact = 1;
		for(int i = 1; i<=n; i++){
			fact= fact*i;
		}
		System.out.println(fact);
	}
}

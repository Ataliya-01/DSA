/* SUM OF NATURAL NUMBERS


You are given an integer N. Your task is to output the sum of all natural numbers till N.

Natural numbers are a part of the number system, including all the positive numbers from 1 to infinity.

Input Format
First line is an integer N

Output Format
Print the sum of the first N natural numbers.

Example 1
Input

5
Output

15
Explanation

Here, n = 5, so 1 + 2 + 3 + 4 + 5 = 15

Example 2
Input

1
Output

1

 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class SumofNaturalNumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
     long sum=0;
    for(int i=1;i<=N;i++){
   // sum= ( N*(N+1) )/2;
		sum+=i;
    }
    System.out.println(sum);
	}
}
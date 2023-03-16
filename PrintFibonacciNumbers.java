/* PRINT FIBONACCI NUMBERS


You've to print first n Fibonacci numbers. Take as input n, the count of Fibonacci numbers to print.

Print first n Fibonacci numbers.

Input Format
The first line contains an integer n.

Output Format
Print first n Fibonacci numbers.

Example 1
Input

10
Output

0
1
1
2
3
5
8
13
21
34
Explanation

The first 10 terms of the Fibonacci sequence are printed above.

Example 2
Input

2
Output

0
1
Explanation

The first 2 terms of the Fibonacci sequence are printed above.

 */

import java.util.*;

public class PrintFibonacciNumbers {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

	  System.out.println(0);
	  int a = 1;
	  int b = 1;
	  for(int i = 2; i<=n; i++){
		   System.out.println(a);
		  int c = a+b;
		  a = b;
		  b = c;
	  }
  }
}

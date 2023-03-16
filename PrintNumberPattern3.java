/* Print Number Pattern 3

You are given n the number of row of the pattern you have to print.

Input Format
The first line of input contains n the number of rows in the pattern.

Output Format
For each n, print the following pattern.

Example 1
Input

5
Output

0
1 1
2 3 5
8 13 21 34
55 89 144 233 377
Explanation

In the example input you are given 5 rows, and this is the desired patttern.

Example 2
Input

7
Output

0
1 1
2 3 5
8 13 21 34
55 89 144 233 377
610 987 1597 2584 4181 6765
10946 17711 28657 46368 75025 121393 196418
Explanation

The 7 row pattern is given in the output.

 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrintNumberPattern3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        solve(n);
    }

    public static void solve(int n)
    {
        // your code here
		int a = 0, b =1;
		int count = 1;
        for(int i =1; i<=n; i++){
			for(int j = 1; j<=i; j++){
				if(count==1)
					System.out.print(a+" ");
				else if(count==2)
				System.out.print(b+" ");
				else
				{
					int c = a+b;
					System.out.print(c+" ");
					a = b;
					b = c;
				}
				count++;
			}
			System.out.println();
		}
		
    }
}
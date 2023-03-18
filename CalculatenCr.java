/* Calculate nCr

Given n and r, your task is to calculate nCr.

Here nCr is the total number of ways for selecting r elements out of n options are nCr = (n!) / (r! * (n-r)!) where n! = 1 * 2 * . . . * n.

Input Format
Input consists of one line having two integers n followed by r.

Output Format
We have to calculate nCr using the formula as given in the question.

Example 1
Input

5 2
Output

10
Example 2
Input

3 1
Output

3
 */

import java.util.*;

public class CalculatenCr
 {

    static long calculate_nCr(int n, int r) {
        // write code here 
		return fact(n) / (fact(r) * fact(n - r));  
    }   
	static long fact(int n)   
{   
    long res = 1;   
           for (int i = 2; i <= n; i++)   
           res = res * i;   
          return res;   
}   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        long ans = calculate_nCr(n,r);
        System.out.print(ans);
    }
}
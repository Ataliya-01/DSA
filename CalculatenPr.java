/* Calculate nPr


Given 2 numbers n and r. Your task is to calculate nPr n!/(n-r)!.

Input Format
The first line of Input contains a single integer n.

The second line of input contains a single integer r.

Output Format
Return the value of nPr.

Example 1
Input

5
2
Output

20
Explanation

The value of 5! is 120 and 3! is 6, 120/6 = 20.

Example 2
Input

3
3
Output

6
Explanation

The value of 3! is 6, and 0! is 1.
 */


import java.util.*;
  
  public class CalculatenPr
{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
   
   public static int getValueInBase(int n, int r){
    // Your code here
	   return (fact(n)) / (fact(n-r));
   }
	   static int fact(int n){
		   int res = 1;
	   for (int i = 1; i <= n; i++)   
           res = res * i;   
          return res;
	   }
   }
  
/* Palindrome Number


Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backward as forward.

Input
The line inputs N.

Output
You need to print "true" if the number is palindrome otherwise "false" (without quotes).

Example 1
Input

5
Output

true 
Example 2
Input

121
Output

true 
 */



import java.util.*;
import java.lang.*;
import java.io.*;

public class PalindromeNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=n;
    int temp=0;
    while(n>0){
		int digit = n%10;
      //temp=temp*10+(n%10);
		temp = temp*10+digit;
      n=n/10;
    }
    if(temp==a){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
    
	}
}
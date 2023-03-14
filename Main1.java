
/* INPUT / OUTPUT IN JAVA */

/* In this challenge, you will learn to read input for the first time. The most popular way to read input in java is by using Scanner.

For example:

Scanner scanner = new Scanner(System.in);
int myInt = scanner.nextInt();
For printing it

System.out.println( myInt);
The code above creates a Scanner object named scanner and uses it to read an integer. It prints output using System.out.println(MyInt). So, if our input is:

5
Our code will print:

5
In this challenge, you must read 3 integers and then print them. Each integer must be printed on a new line.

Input Format
There are 3 lines of input, and each line contains a single integer.

Output Format
3 lines of output, each line containing a single integer

Example 1
Input

42
100
125

Output

42
100
125

Example 2
Input

452
105
25

Output

452
105
25
 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int myInt = sc.nextInt();
     int myInte = sc.nextInt();
     int myInteg = sc.nextInt();
    System.out.println(myInt);
     System.out.println(myInte);
     System.out.println(myInteg);
	}
}
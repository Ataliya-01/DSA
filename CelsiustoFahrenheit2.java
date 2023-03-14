/* CELSIUS TO FAHRENHEIT 2

Given a temperature in Celsius, output the fahrenheit equivalent of it.

Note

Print complete answer up to 6 decimal places.

Input Format
Input consists of 1 line of a decimal number.

Output Format
Output consists of a single line of temperature in Fahrenheit.

EXAMPLE 1
Input:

32
Output::

89.600000
EXPLANATION:

To convert temperatures in degrees Celsius to Fahrenheit, multiply by 1.8 (or 9/5) and add 32.

EXAMPLE 2
Input:

25
Output:

77.00000
EXPLANATION:

To convert temperatures in degrees Celsius to Fahrenheit, multiply by 1.8 (or 9/5) and add 32.

 */


import java.util.*;
import java.lang.*;
import java.io.*;

public class CelsiustoFahrenheit2

{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
    double C= sc.nextDouble();
  //  double F= ((C*9)/5d)+32;
		double F = ((C*1.8d) + 32);
    System.out.printf("%.6f",F);
	}
}
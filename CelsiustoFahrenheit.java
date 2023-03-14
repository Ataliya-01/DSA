/* CELSIUS TO FAHRENHEIT


Given the temperature of a city in celsius(C), your task is to convert the temperature to Fahrenheit(F) and return it.

Formula : (C* (9/5)) + 32 = F

Note: It is guaranteed that the temperature in celsius, C, will be a multiple of 5.

Input Format
An integer C, represents the temperature in Celsius which is a multiple of 5.

Output Format
Return an integer containing the converted temperature in Fahrenheit.

Example 1
Input

25
Output

77
Explanation

25 * 9/5 + 32 = 77

Example 2
Input

-40
Output

-40

 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class CelsiustoFahrenheit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		
    
    int Fah,Cel;
    Scanner sc = new Scanner(System.in);
    Fah=sc.nextInt();
    Cel=((Fah*9)/5)+32;
    System.out.println(Cel);
	}
}
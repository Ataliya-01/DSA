/* NUMBER OF DAYS

Given the number of the month, your task is to calculate the number of days present in the particular month.

Note:- Consider non-leap year.

Input Format
An integer M, denoting the number of the month.

Output Format
Return the number of days in the month corresponding to the given number. Consider a non-leap year.

Example 1
Input

1
Output

31
Explanation

January has 31 days.

Example 2
Input

3
Output

31
Explanation

March has 31 days.

 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class NumbeOfDays
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int month= sc.nextInt();
     int year = 2012;
        if((month==2) && ((year%4==0) || ((year%100==0)&&(year%400==0))))
            System.out.println("28");

        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println("31");

        else
            System.out.println("30");


    }

}
	

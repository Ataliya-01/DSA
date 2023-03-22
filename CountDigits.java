/* Count Digits

Write a program to find the total number of digits in a single input number n.

Your task is to complete the function numDigits which receives n as the parameter and returns the number of digits in n.

Input Format
First line contains an integer number n.

Output Format
Print the count of digits in first line.

Example 1
Input

13472
Output

5
Explanation

The number has 5 digits

Example 2
Input

123456
Output

6
Explanation

The number has 6 digits
 */

import java.util.*;

public class CountDigits
 {
    static int numDigits(int num){
        //Write your code here
		int count = 0;
		while(num>0){
		int digit = num % 10;
		count++;
			num/=10;
		}
		return count;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numDigits(n));
    }
}

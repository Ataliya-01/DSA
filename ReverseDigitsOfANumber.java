/* REVERSE DIGITS OF A NUMBER

Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.

For example, if the input is 12345, the output should be 54321.

Note: Input number will not have any trailing zeros.

Input Format
The first line of input contains the integer n.

Output Format
The output should be the reverse of n.

Example 1
Input

12345
Output:

54321
Example 2
Input

143323
Output

323341

 */

import java.util.*;

public class ReverseDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        reverseDigits(n);
        sc.close();
    }

	public static void reverseDigits(int n) {
		// your code here
        int digit = 0;
		int reverse = 0;
		while(n != 0){
		digit = n%10;
		reverse = reverse*10+digit;
		for(int  i = 0; i<n; i++);
		n/=10;
		}
		System.out.println(reverse);
    }
}
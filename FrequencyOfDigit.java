/* Frequency of digit

You are given a number n and a digit d.

You are required to calculate the frequency of the digit d in the number n.

Note:- Don't change the Function Definition in the solution Class just return the frequency to the main function and the main function prints the frequency.

Input Format
The first line of input contains an integer n.

Next line of input contains an integer d which represents the digit whose frequency has to be counted.

Output Format
Print the frequency of the given digit d.

Example 1
Input

986272
2
Output

2
Explanation

2 occurs 2 times in the given digit. Hence the output will be 2.

Example 2
Input

1973672936423
3
Output

3
Explanation

3 occurs 3 times in the given digit. Hence the output will be 3.

 */


import java.util.*;

public class FrequencyOfDigit
 {

	static int FrequencyofDigits(long n, int d) {
        // write code here
		int c = 0;
		while(n>0){
			if (n % 10 == d)
            c++;
			n = n / 10;
		}
		return c;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = sc.nextInt();
        System.out.println(FrequencyofDigits(n, d));
    }
}
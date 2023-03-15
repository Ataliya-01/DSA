/* NUMBER ROTATION

Given two numbers n and k, you need to rotate n, k times to the right. If k is negative, rotate n, k times to the left.

Note:

Rotating right means removing rightmost digit from n and adding it to the start.

Rotating left means removing leftmost digit from n and adding it to the end.

Assume that the number of rotations will not result in leading 0's, i.e. n=1203, k =2 such that 0312 is the answer, such test cases will not be given.

k can be bigger than n.

Input Format
First line which has two integer n and k.

Output Format
Print the rotated number in a single line.

Example 1
Input

1256 1
Output

6125
Explanation

since k=1, right rotating the number one time leads to 6125.

Example 2
Input

1256 -1
Output

2561
Explanation

since k=1, left rotating the number one time leads to 2561.

 */

import java.util.*;

public class NumberRotation {
    public static void main(String[] args) {

        // Write your code here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int k = sc.nextInt();
		// Extract the last k digits and place them at the
		// start of the number
		int temp = n, dig = 0;
		while(temp != 0){
			dig++;
			temp = temp / 10;
		}
		k = k % dig; // NEW
		if(k < 0){   // NEW
			k = k + dig;
		}
		int div = 1;
		for(int i = 0; i < k; i++) // runs k times
			div = div * 10;
		// div is now 10^k
		int rem = n % div; // last k digits
		int quo = n / div; // first (dig - k) digits
		int mult = 1;
		for(int i = 0; i < dig - k; i++)
			mult *= 10;
		System.out.println(rem * mult + quo);
		
    }
}

    

/* Optimus Prime

Given an integer n, print all prime numbers between 1 and n (both inclusive).

Example:

If n = 8, your program should output all prime numbers between 1 and 8. Thus, it should output:

2
3
5
7
Input Format
The first line of the input contains one integer n.

Output Format
Your code should output all integers between 1 and n that are prime (both inclusive).

Example 1
Input:

8
Output:

2
3
5
7
Example 2
Input:

13
Output:

2
3
5
7
11
13

 */

import java.util.*;

public class findPrimesUntilN {
    static void findPrimesUntilN(int n) {
        //Write code here
		int i,j;
		int flag; 
		for( i = 1; i<=n; i++){
			if (i == 1 || i == 0)
                continue;

			flag = 1;
 
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
				}
			}
			if (flag == 1)
                System.out.println(i);
		}
    }
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findPrimesUntilN(n);
    }
}
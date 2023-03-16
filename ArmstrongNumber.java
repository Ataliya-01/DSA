/* ArmstrongNumber

Write a program to print out all Armstrong numbers between 1 and N.

A number is called an Armstrong number if the sum of cubes of each digit of the number is equal to the number itself.

For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

Input Format
The input contains a single integer representing N.

Output Format
Print all the Armstrong numbers from 1 to N in separate lines.

Example 1
Input

200
Output

1
153
Explanation

1 and 153 are only Armstrong numbers between 1 to 200.

Example 2
Input

1000
Output

1
153
370
371
407
Explanation

1, 153, 370, 371, 407 are only Armstrong numbers between 1 to 1000.
 */

import java.util.*;

class ArmstrongNumber {
    static void armstrong(int n) {
       
		for(int i=1; i<=n; i++){
			if(isArmstrong(i)){
				System.out.println(i);
			}
		}		
    }
    
	static boolean isArmstrong(int n){
		int ans = 0;
		int t = n;
		while(n > 0){
			int d = n%10;
			ans +=d*d*d;
			n /= 10;
		}
		if(ans == t)
			return true;
		else
			return false;
	}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        armstrong(N);
    }
}

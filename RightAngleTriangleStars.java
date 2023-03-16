/* Right Angle Triangle Stars


Given an integer n, print a right angled triangle full of stars with height and base equal to n.

Input Format
The first line of input contains the integer n.

Output Format
The output should contain a right angled triangle filled with stars with height and base equal to n.

Example 1:
Input

3
Output:

*
**
***
Explanation:

Since n = 3, 3 lines with increasing number of stars are printed.

Example 2:
Input

7
Output

*
**
***
****
*****
******
*******
Explanation:

Since n = 7, 7 lines with increasing number of stars are printed.

 */

import java.util.*;

public class RightAngleTriangleStars
 {
    public static void rightAngle(int row) {
        //Write code here
		for(int i=0; i<row; i++)   
			{   
				for(int j=0; j<=i; j++)   
				{   
				System.out.print("*");   
				}   
				System.out.println(); 
			}
	}
	  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rightAngle(n);
        sc.close();
    }
}
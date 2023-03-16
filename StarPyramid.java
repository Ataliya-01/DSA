/* Star Pyramid

Given an integer n, print a pyramid full of stars with height equal to n.

Input Format
The first line of input contains the integer n.

Output Format
The output should contain a pyramid filled with stars with height equal to n.

Example 1
Input

3
Output:

Pattern Image

Example 2
Input

7
Output

Pattern Image
 */



import java.util.*;

public class StarPyramid
 {
    public static void starPyramid(int n) {
        //Write code here
		for(int i = 0; i<n; i++){
			for(int j = n-i; j>1; j--){
				System.out.print(" ");
			}
			for(int  j =0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        starPyramid(n);
        sc.close();
    }
}
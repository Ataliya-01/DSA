/* Diamond Pattern


Given an integer N, print a diamond full of stars * with height equal to N.

Note It is given that N is odd.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains an integer N denoting the height of the pyramid.

Output Format
For each test case print the required pattern.

Example 1
Input

1
5
Output


Explanation

The required diamond of height 5 has been returned.

Example 2
Input

1
3
Output


Explanation

The required diamond of height 3 has been returned.
 */



import java.util.*;
class DiamondPattern{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
	        int sp = n-1;
			int st = 1;
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=sp; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=st; j++){
				System.out.print("* ");
			}
			if(i <= n/2){
				sp-=2;
				st+=2;
			}
			else{
				sp+=2;
				st-=2;
			}
			System.out.println();
		}
		}
    }
	
	// public static void main(String[] args){
 //        Scanner sc = new Scanner(System.in);
	// 		int t=sc.nextInt();
	// 		int n=sc.nextInt();
	// 		while(t-->0){
	// 			diamondPattern(n);
	// 			//t--;
	// 		}
	// }
}
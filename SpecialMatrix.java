/* Special Matrix

A square matrix is called special matrix if all the non-diagonal elements of the matrix are zero and the diagonal elements are non-zero.

You are given a square matrix with N rows and columns. You have to check whether the given matrix is special or not.

NOTE: You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format:
The first line contains the number of test cases.

For each test case: The first line contains N.

The next N lines contain N integers each representing the elements of the matrix.

Output Format:
For each test case in t, output t lines true if the matrix is special else false

Example 1:
Input:

1
3
1 0 2
0 2 0
3 0 1
Output:

true
Explanation:

The diagonal elements are non-zero and non-diagonal elements are zero.

Example 2:
Input:

1
3
1 0 1
1 2 0
2 0 3
Output:

false
Explanation:

The non-diagonal element in second row of first column is non-zero.

Constraints:
1 <= T <= 10

1 <= N <= 200

0  <= A[i] <=1000000
*/


import java.io.*;
import java.util.*;

class Solution{
    static boolean special(int matrix[][], int n){
         	for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j && matrix[i][j]==0){
					return false;
				}else if(i+j == n-1 && matrix[i][j]==0){
					return false;
				}else if(i!=j && i+j!=n-1 && matrix[i][j]!=0){
					return false;
				}
			}
		}
		return true;
    }
}
class SpecialMatrix{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            boolean ans = ob.special(matrix, n);
            System.out.println(ans);
        }
    }
}
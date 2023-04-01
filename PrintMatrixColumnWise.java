/* Print Matrix Column Wise

Given a 2-D matrix A with N rows and M columns. Print the matrix in column-major order.

Your task is to complete the function printMatrixColumnwise which receives the input matrix, N, and M as its parameters and prints the matrix in column major order.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains two integers N and M denoting the number of rows and columns respectively.

The next N lines contains M integers each denoting the elements of matrix A.

Output Format
For each test case print N*M space-separated integers, the elements of the matrix column wise in a single line.

Example 1
Input:

1
3 3
1 2 3
4 5 6
7 8 9
Output:

1 4 7 2 5 8 3 6 9
Explanation:

The elements of the matrix have been printed column wise.

Example 2
Input:

1
2 2
1 3
2 4
Output:

1 2 3 4
Explanation:

The elements of the matrix have been printed column wise.

Constraints
1 <= T <= 10

1 <= N,M <= 1000

0 <= A[i] <= 100000
 */




import java.util.*;

class Solution {
    public void printMatrixColumnwise(int[][] mat,int n,int m) {
        //Write code here and print output
		int i, j;
       for( j = 0; j<m; j++){
		  for(i=0;i<n;i++ ){
			   
			   System.out.print(mat[i][j]+" ");
		   }
	   }
		System.out.println();
    }
}

public class PrintMatrixColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t>0)
        { 
            int n;
       int m;
        n = sc.nextInt();
       m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printMatrixColumnwise(matrix,n,m);
        t--;
        }
        sc.close();
    }
}
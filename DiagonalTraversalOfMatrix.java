/* Diagonal Traversal of a Matrix

Give a N * N square matrix, return all the elements of its anti-diagonals from top to bottom.

Input Format
First line contains N, representing the order of the 2D matrix.

Next N lines contains N spaced elements each representing matrix elements.

Output Format
Output in a sigle line, the Diagonal traversal of the matrix.

The traversal should start from the top right of the matrix in bottom right direction and should continue upto bottom left.

Example 1
Input

2
1 2
3 4
Output

2 1 4 3
Explanation:

Topmost anti-diagonal is [[2]]

Next anti-diagonal is [[1, 4]]

and the last anti-diagonal is [[3]]

Example 2
Input

3
1 2 3
4 5 6
7 8 9
Output

3 2 6 1 5 9 4 8 7
EXPLANATION

Topmost anti-diagonal is [[3]]

Next anti-diagonal is [[2, 6]]

Next anti-diagonal is [[1, 5, 9]]

Next anti-diagonal is [[4, 8]]

and the last-diagonal is [[7]]
 */



import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalTraversalOfMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        sc.close();
		diagonalTraversal(mat,n);
		

    }

    public static void diagonalTraversal(int[][] mat, int n) {
      

		int i,j;
		for(int k=n-1;k>=0;k--)
			{
				i=0;
				j=k;
				while(j<=n-1 && i<=n-1)
					{
						System.out.print(mat[i][j]+" ");
						i++;
						j++;
					}
			}
		for(int k=1;k<=n-1;k++)
			{
				i=k;
				j=0;
				while(j<=n-1 && i<=n-1)
					{
						System.out.print(mat[i][j]+" ");
						i++;
						j++;
					}
			}
        
    }
}
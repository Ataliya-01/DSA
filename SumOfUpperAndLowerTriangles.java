/* Sum of upper and lower triangles

Given a square matrix of size n*n, print the sum of upper and lower triangular elements.

Upper Triangle consists of elements on the diagonal and above it.

Lower triangle consists of elements on the diagonal and below it.

Note

Diagonal here refers to the primary diagonal (starting at upper left corner and ending at bottom right corner).

Your task is to complete the function triangleSums which receives n and input matrix as parameters and prints the sum of upper and lower triangles separated by space.

Input Format
First line contains the value 'n'.

Next 'n' of each lines contain 'n' spaced integers.

Output Format
Print space separated sum of upper triangle followed by lower triangle.

Example 1
Input

3
1 2 3
1 5 3
4 5 6
Output

20 22
Explanation

Sum of lower triangle is 1+5+6+1+5+4 = 22 and upper triangle is 1+5+6+2+3+3 = 20

Example 2
Input

2
1 2
5 6
Output

9 12
Explanation

Sum of lower triangle is 1+6+5= 12 and upper triangle is 1+6+2 = 9
 */


import java.util.*;

public class SumOfUpperAndLowerTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        triangleSums(n, matrix);
        sc.close();
    }

    public static void triangleSums(int n, int[][] matrix) {
        // your code here
		int upperSum = 0, lowerSum = 0;
		for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
				if(i<=j)
					upperSum+=matrix[i][j];
				if(i>=j)
					lowerSum+=matrix[i][j];
			}
		}
		System.out.print(upperSum+" "+lowerSum);
    }
}
/* Maxima Minima

Given an n*n matrix mat find an element such that it is the smallest in a row and largest in a column, if such an element does not exist return -1.

Input Format
First line contains the values n.

Next n lines contain n spaced integers.

Output Format
Return the element that is smallest in a row and largest in a column if not found return -1.

Example 1
Input

2
1 3
6 5
Output

5
Explanation

Row 2 contains minimum element 5 that is largest in the 2nd column.

Example 2
Input

1 2 3
4 5 6
7 8 9
Output

7
Explanation

Here the minimum value is 7 in the third row and the largest value in the 1st column.

Constraints
1 <= n <= 10^3

1 <= mat[i][j] <=10^5

 */


import java.util.*;

public class MaximaMinima {
    public static int maximaMinima(int[][] mat) {
		int k=0;
        for (int i = 0; i < mat.length; i++){
			int minr=mat[i][0];
		for (int j = 1; j < mat.length; j++){
			if(mat[i][j]<minr){
				minr=mat[i][j];
				k=j;
			}
		}
		int max=maxima(mat,k);
		if(max==minr){
		return max;
    }
}
return -1;
}
public static int maxima(int [][]mat ,int j){
	int max=0;
	for (int i = 0; i < mat.length; i++){
			if(mat[i][j]>max){
				max=mat[i][j];
}
}
return max;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix);
        System.out.println(result);
        sc.close();
    }
}
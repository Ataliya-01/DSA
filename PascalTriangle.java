/* Pascal's Triangle

You are given a number n, you are required to print the first n rows of the pascal triangle.

Pascal Triangle

Your task is to complete the function pascalTriangle which receives n as the parameters and returns a 2D array containing the first n rows of the pascal's triangle.

Input Format
You are given a single integer n representing the number of rows of pascal's triangle.

Output Format
Print n lines of output, where ith line represents the ith row of the triangle.

Example 1
Input

3
Output

1
1 1
1 2 1
Example 2
Input

5
Output

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
Constraints:
1<= n <= 30
 */



import java.util.*;

public class PascalTriangle {
   
        
        public static void printPascal(int n)
    {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
 
                // for left spacing
                //System.out.print(" ");
            }
 
            // used to represent C(line, i)
            int C = 1;
            for (int i = 1; i <= line; i++) {
 
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
 
    // Driver code
    public static void main(String[] args) throws Throwable {
    
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        printPascal(n);
    }
}
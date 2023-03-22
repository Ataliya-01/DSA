/* AS Basic DataTypes 1

Take user input of 3 integer numbers (x,y,z) to perform following operations using them.

Op1 = x+y+z

Op2 = x*y-z

Store the values of these operations in 2 different variables of integer type (Op1,Op2) and simply print them in the same order in separate lines.

Input Format
First line contains input of x, y, z separated by a space

Output Format
First line contains Op1

Second line contains Op2

Example 1
Input

2 3 4
Output

9
2
Explanation

Op1=2+3+4 = 9 & Op2= 2*3-4=2

Example 2
Input

5 8 9
Output

21
31
Explanation

Op1=5+8+9 = 21 & Op2= 5*8-9=31

Required Time Complexity: O(1)

Required Space Complexity: O(1)

 */


import java.util.*;

class Solution {
    static void printOperations(int x, int y, int z){
        //Write code here and print output
    int op1 = x+y+z;
	int op2 = x*y-z;
		System.out.print(op1+ "\n" +op2);
    }
}
public class ASBasicDataTypes1
 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Solution.printOperations(x, y, z);
    }
}
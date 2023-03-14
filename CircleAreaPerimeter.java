/* CIRCLE AREA-PERIMETER

You are required to take the radius of a circle as input from the user, and finally, print the area and perimeter of the circle.

Note: Take pi as 3

Input Format
One line contains a number which is the radius of a circle.

Output Format
Print the area of the circle in the first line

Print the perimeter of the circle in the second line

Example 1
Input

4
Output

48
24
Explanation

2 * pi * r = 24 and pi * r * r = 48, where r is radius.

Example 2
Input

7
Output

147
42
Explanation

2 * pi * r = 147 and pi * r * r = 42, where r is radius

 */


import java.util.*;

class Solution {
    public void CircleAreaPerimeter(double r) {
        //Write your code here
		double cir = 2*3.14*r;
		double peri = 3.14*r*r;
		System.out.println(peri);
		System.out.println(cir);
    }
}
//main class
public class CircleAreaPerimeter {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
        Solution Obj = new Solution();
        Obj.CircleAreaPerimeter(r);
    }
}

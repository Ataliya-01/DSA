/* GRADING SYSTEM

You are given marks of a student as input. Display a correct message based on the following rules:

for marks above 90, print "Excellent".
for marks above 80 and less than equal to 90, print "Good"
for marks above 70 and less than equal to 80, print "Fair".
for marks above 60 and less than equal to 70, print "Meets Expectations".
for marks below 60, print "Below Expectations".


You have to complete grade function which contains integer N as input and return string answer as output

Input Format
There is a single integer N.

Output Format
Print a single string in a line.

Example 1
Input

95
Output

Excellent
Explanation

As according to given condition , for N (marks) >90 - Excellent is printed

Example 2
Input

75
Output

Fair
Explanation

As according to given condition , for 70 < N (marks) < 80 - Fair is printed

 */


import java.util.*;

class Accio {
    static void grade(int n)
    {
        //Write Your Code here
		if(90<n){
			System.out.println("Excellent");
		}else if(80<n && 90>=n){
			System.out.println("Good");
		}else if(70<n && 80>=n){
			System.out.println("Fair");
		}else if(60<n && 70>=n){
			System.out.println("Meets Expectations");
		}
		else{
			System.out.println("Below Expectations");
		}
    }
}

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Accio Obj = new Accio();
        Obj.grade(n);
    }
}
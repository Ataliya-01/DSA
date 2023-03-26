/* /* Conditional Problem 4

You are given a letter of English alphabets. Write a program using switch case to print the following outputs for different inputs as :

If input is 'A' , print "I am the first letter", 
If input is 'B' , print "I am the second letter", 
If input is 'C' , print "I am the third letter",
If input is 'D' , print "I am the fourth letter", 
If input is 'E' , print "I am the fifth letter",
For any other input character, print "I don't belong here". 
Note that, Input characters will only be Capital Letters.

Input Format
First line contains a character

Output Format
Return the sentence related to the character as per description.

Example1
Input

A
Output

I am the first letter
Example 2
Input

G
Output

I don't belong here
 */

import java.util.*;

class Accio{
    static String ConditionalProblem4(char c){
        //write code here
		switch(c){
			case 'A':
				return "I am the first letter";
			case 'B':
				return "I am the second letter";
			case 'C':
				return"I am the third letter";
			case 'D':
				return"I am the fourth letter";
			case 'E':
				return"I am the fifth letter";
		}
		return "I don't belong here";
    }
}

public class ConditionalProblem4 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        Accio obj = new Accio();
        String ans=obj.ConditionalProblem4(c);
        System.out.println(ans);
    }
}
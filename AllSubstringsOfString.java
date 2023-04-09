/* All substrings of a string

Given a string str, print all possible non-empty substrings of str, in order of occurrence in the string.

Input Format
Input consists of a single line of string.

Output Format
Print all the substrings of a string in order of occurrence in the string in different lines.

Example 1
Input

abc
Output

a
ab
abc
b
bc
c
Explanation:

These are the possible non-empty substrings.

Example 2
Input

abcd
Output

a
ab
abc
abcd
b
bc
bcd
c
cd
d
Explanation:

These are the possible non-empty substrings.

Constraints
0 <= str.length() <= 280
 */



import java.util.*;

public class AllSubstringsOfString {
	static void SubString(String str) {
        //Write code here
       for(int si=0; si<str.length(); si++){
		   for(int ei = si+1; ei<=str.length();ei++){
			   System.out.println(str.substring(si,ei));
		   }
	   }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SubString(str);
    }
}
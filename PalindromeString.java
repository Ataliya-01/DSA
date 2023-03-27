/* Palindrome String

Given a string str, determine if it is a palindrome, considering only alphabetic characters and ignoring the upper or lower case. Return 0 if it is not a palindrome, else return 1.

Input Format
Input consists of one line

The first line given is a string str.

Output Format
Returns 0 if it is not a palindrome, else return 1 if it is a palindrome

Example 1
Input

race a car
Output

0
Explanation

Not a palindrome

Example 2
Input

a man, a plan, a canal Panama
Output

1
Explanation

It is a palindrome.

Constraints
1 <= str.length <= 10000

 */



import java.io.*;
import java.util.*;

public class PalindromeString {
	static int isPalindrome(String str)
      {
              //write code here
		  String str1 = str.toLowerCase();
		  int s = 0;
		  int e = str1.length()-1;
		  while(s<e){
			  if(!Character.isAlphabetic(str1.charAt(s))){
				  s++;
			  }else if(!Character.isAlphabetic(str1.charAt(e))){
				  e--;
			  }else{
				  if(str1.charAt(s)!=str1.charAt(e)){
					  return 0;
				  }else{
					  s++;
					  e--;
				  }
			  }
		  }
		  return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);        
    }
}
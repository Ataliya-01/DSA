/* Camel Case

You are given a string consisting of different words separated by underscores _. You have to convert the string to camel case. The first letter of the entire case should be lowercase.

eg: app_dsd_sdda to appDsdSdda

Note:

StringBuilder in Java represents a mutable sequence of characters.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains the string S.

Output Format
For each test case print the final formed string in a new line.

Example 1
Input:

1
abb_b_cc_d
Output:

abbBCcD
Explanation:

We remove the underscores and convert the next character to uppercase.

Example 2
Input:

1
how_are_you
Output:

howAreYou

Explanation:

We remove the underscores and convert the next character to uppercase.
 */



import java.util.*;

class CamelCase {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      String ans = camelCase(s);
      System.out.println(ans);
    }
  }

  static String camelCase(String s) {
    // your code here
	  // String res = "";
	  // for(int i = 0; i<s.length(); i++){
		 //  if(s.charAt(i) =='_'){
		 //  }else if(i>0 && s.charAt(i-1) =='_'){
			//   res = res+Character.toUpperCase(s.charAt(i));
			//  }else{
			//   res=res+s.charAt(i);
			//  }
		 //  }
	  // return res;
	  StringBuilder sb=new StringBuilder(s);
	  for(int i=0;i<sb.length();i++){
		  if(sb.charAt(i)=='_'){
			  sb.deleteCharAt(i);
			  sb.replace(i,i+1,String.valueOf(Character.toUpperCase(sb.charAt(i))));
		  }
	  }
      return sb.toString();
	  
	  }
  }
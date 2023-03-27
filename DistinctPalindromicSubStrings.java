/* Distinct Palindromic SubStrings

Given a string s, print all the substrings of s that are palindromic. Print all the required substrings in lexicographical order.

A substring is a subset or part of another string, or it is a contiguous sequence of characters within a string.

A lexicographic order is an arrangement of characters, words, or numbers in alphabetical order, that is, the letters are sorted from A-Z.

Input Format
First line contains a string s.

Output Format
Print various strings according to the question, each string should be in a new line

Example 1
Input

abc
Output

a
b
c
Example 2
Input

abccbc
Output

a
b
bccb
c
cbc
cc
Constraints
1 <= s.size() <= 1000


 */



import java.util.*;

public class DistinctPalindromicSubStrings {
    static void palindromeSubStrs(String s) {
       int n = s.length(); int[][] R = new int[2][n+1];

    s = "@" + s + "#";

    for (int j = 0; j <= 1; j++)
    {
        int rp = 0;
        R[j][0] = 0;

        int i = 1;
        while (i <= n) {
            while (s.charAt(i - rp - 1) == s.charAt(i +
                    j + rp))
                rp++;
            R[j][i] = rp;
            int k = 1;
            while ((R[j][i - k] != rp - k) && (k < rp))
            {
                R[j][i + k] = Math.min(R[j][i - k],
                        rp - k);
                k++;
            }
            rp = Math.max(rp - k,0);
            i += k;
        }
    }

    s = s.substring(1, s.length()-1);

    ArrayList<String> ans = new ArrayList<>();

    ans.add(s.charAt(0)+"");
    for (int i = 1; i < n; i++)
    {
        for (int j = 0; j <= 1; j++)
            for (int rp = R[j][i]; rp > 0; rp--)
                ans.add(s.substring(i - rp - 1,  i - rp - 1 + 2 * rp + j));
        ans.add(s.charAt(i)+"");
    }

    Collections.sort(ans.subList(0, ans.size()));
    if(ans.size() != 0)
        System.out.println(ans.get(0));
    for(int i = 1; i < ans.size(); i++) {
        if(!Objects.equals(ans.get(i - 1), ans.get(i))) {
            System.out.println(ans.get(i));
        }
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        palindromeSubStrs(s);
    }
}
/* Subarray sum divisible by k

Given an integer array nums and an integer k, print the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

Input Format
Input consists of two lines.

The first line contains two integers n (size of the array) and k.

The second line contains n spaced integers.

Output Format
Print count of subarrays divisible by k

Example 1
Input

6 5 
4 5 0 -2 -3 1
Output

7
Explanation

There are 7 subarrays with a sum divisible by k = 5:

[4, 5, 0, -2, -3, 1]

[5]

[5, 0]

[5, 0, -2, -3]

[0]

[0, -2, -3]

[-2, -3]

Example 2
Input

4 2 
4 5 0 -2
Output

4
Explanation

There are 4 subarrays with a sum divisible by k = 2:

[4]

[0]

[0 -2]

[-2]
 */


import java.io.*;
import java.util.*;

public class SubarraySumDivisibleByK
 {

    public static int subarrayDivisbleByK(int arr[], int n, int k){
        // Write code here
		int mod[] = new int[k];
        Arrays.fill(mod, 0);

		int cumSum = 0;
        for (int i = 0; i < n; i++) {
            cumSum += arr[i];

			mod[((cumSum % k) + k) % k]++;
        }
		int result = 0;
		for (int i = 0; i < k; i++)
			 if (mod[i] > 1)
                result += (mod[i] * (mod[i] - 1)) / 2;

		 result += mod[0];
 
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        int result = subarrayDivisbleByK(arr, n, k);
        System.out.print(result);        
        System.out.println('\n');
    }
}
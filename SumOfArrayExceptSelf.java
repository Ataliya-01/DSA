/* Sum of Array Except Self

Given an array of n integers where n > 1, return an array output such that output[i] is equal to the sum of all the elements of nums except nums[i]. All integers in array are greater than 0.

Input Format
First line consists of an integer n which is the number of elements in array

Next n lines correspond to n elements of array

Output Format
Return the resultant array as asked in question.

Example 1
Input

4
4 3 2 10
Output

15 16 17 9
Explanation

After updation,

a[0]=15 i.e., 3+2+10

a[1]=16 i.e., 4+2+10

a[2]=17 i.e., 4+3+10

a[3]=9 i.e., 4+3+2
 */


import java.util.*;

public class SumOfArrayExceptSelf
 {

    public static int[] SumArrayExpectSelf(int[] arr, int n) {
        //Write code here
		int res[] = new int[n];
		int left[] = new int[n];
		int right[] = new int[n];

		left[0] = 0;
		for(int i = 1; i<n; i++){
			left[i] = left[i-1] + arr[i-1];
		}
		right[n-1] = 0;
		for(int i = n-2; i>=0; i--){
			right[i] = right[i+1]+arr[i+1];
		}
		for(int i = 0; i<n; i++){
			res[i] = left[i]+right[i];
		
		}
		return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] Ans = SumArrayExpectSelf(nums, n);

        for(int a : Ans)
            System.out.print(a + " ");
    }
}

/*1.Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such
that they add up to target. You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.
Example 1: Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because nums[0] +
nums[1] == 9, we return [0, 1].
Example 2: Input: nums = [3,2,4], target = 6 Output: [1,2]
Example 3: Input: nums = [3,3], target = 6 Output: [0,1]*/
import java.io.*;
import java.util.*;
class TwoSumDemo {
	int n,i,target,complement;int[] arr;
	int[] TwoSum() {
		System.out.println("Enter the size of Array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		arr=new int[n];
		for(i=0;i<n;i++) {
			System.out.println("Enter element :");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target :");
		target=sc.nextInt();
		for(i=0;i<n;i++) {
			complement=target-arr[i];
			for (int j=i+1;j<n;j++) {
				if(arr[j]==complement) {
					return new int[]{i,j};
				}
			}
		}
		return new int[]{-1,-1};
	}

}
class TwoSum {
	public static void main(String[] args) {
		TwoSumDemo obj=new TwoSumDemo();
		int[] result=obj.TwoSum();
		System.out.println(Arrays.toString(result));
	}
}
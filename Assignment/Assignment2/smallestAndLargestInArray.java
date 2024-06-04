//Write a Java Program to find the largest and smallest element from an array.
import java.io.*;
import java.util.*;
class smallAndLarge {
	void show() {
		int n,min,max,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements :");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements :");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		min=arr[0];
		max=arr[0];
		for(i=0;i<arr.length;i++) {
			if (arr[i]<min){
			min=arr[i];}
			if (arr[i]>max){
			max=arr[i];}
		}
		System.out.println("The minimum value in the array ="+min);
		System.out.println("The maximum value in the array ="+max);
	}
}
class smallestAndLargestInArray {
	public static void main(String[] args) {
		smallAndLarge ob=new smallAndLarge();
		ob.show();
	}
}
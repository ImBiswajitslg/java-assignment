//Write a Java Program to implement bubble sort.
import java.io.*;
import java.util.*;
class Bubble {
	int i,n,temp,j;
	void bubble() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements :");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements for sorting :");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(j=1;j<arr.length;j++) {
			for(i=0;i<=arr.length-(j+1);i++) {
				if (arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		System.out.println("After applying bubble sort :");
		for(i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}
}
class bubbleSort {
	public static void main(String[] args) {
		Bubble ob=new Bubble();
		ob.bubble();
	}
}

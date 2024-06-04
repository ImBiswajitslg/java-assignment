// Write a Java Program to implement array of objects.
import java.io.*;
import java.util.*;
class arrayOfObjectsDemo {
	void show(int[] arr)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element :");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The elements entered in array are :");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
class arrayOfObjects {
	public static void main(String[] args) {
		int n,i;
		System.out.println("Enter the number of elements :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		arrayOfObjectsDemo ob=new arrayOfObjectsDemo();
		ob.show(arr);
	}
}

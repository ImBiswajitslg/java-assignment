/*Write Java programs that use both recursive and non-recursive functions for implementing the
following searching methods:
(a) Linear search
(b) Binary search
a)*/
import java.io.*;
import java.util.*;
class LinearSearch {
	public static void main(String[] args) {
		int i,key,len,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of array :");
		len=sc.nextInt();
		arr = new int[len];
		System.out.println("Enter " +len+ " elements :");
		for(i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the key to check :");
		key=sc.nextInt();
		for(i=0;i<len;i++) {
			if (arr[i]==key) {
				System.out.print("The key " +key+ " is at position " +(i+1));
				break;
			}
		}
		if (i==len) {
			System.out.print("The key " +key+ " is not present");
		}
	}
}
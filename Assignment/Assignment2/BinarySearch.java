//BinarySearch
import java.io.*;
import java.util.*;
class BinarySearch {
	public static void main(String[] args) {
		int i,key,len,beg,end,mid=0,flag=0,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of array :");
		len=sc.nextInt();
		beg=0;
		end=len-1;
		arr = new int[len];
		System.out.println("Enter " +len+ " elements :");
		for(i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Enter the key to check :");
		key=sc.nextInt();
		while (beg<=end) {
			mid=(beg+end)/2;
			if (arr[mid]==key) {
				flag=1;
				break;
			} else if (arr[mid]<key) {
				beg=mid+1;
			} else {
				end=mid-1;
			}
		}
		if (flag==1)	System.out.println("Item found at position "+ (mid+1));
		else 			System.out.println("Item not found.");
	}
}
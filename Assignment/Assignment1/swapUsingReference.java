//Write a program to swap two values using object reference. Your program should have a swap
//method.
import java.io.*;
import java.util.*;
class swap {
	void swap(int x,int y) {
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping :");
		System.out.println("The value of first number = " +x);
		System.out.println("The value of second number = " +y);
	}
}
class swapUsingReference {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number to swap :");
		int x = sc.nextInt();
		System.out.println("Enter Second number to swap :");
		int y = sc.nextInt();
		swap Ref;
		swap ob1 = new swap();
		Ref = ob1;
		ob1.swap(x,y);
	}
}
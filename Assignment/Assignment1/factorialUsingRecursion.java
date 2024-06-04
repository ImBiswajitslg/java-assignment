//Write a java program to print Factorial of a given number using recursion.
import java.io.*;
import java.util.*;
class Q5demo {
	int factorial(int num) {
		if (num==0 || num==1) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}
	}
}
class factorialUsingRecursion {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find its factorial :");
		n=sc.nextInt();
		Q5demo ob=new Q5demo();
		System.out.print("The factorial of "+n+" = " +ob.factorial(n)); 
	}
}
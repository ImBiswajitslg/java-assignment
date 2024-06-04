Write a java program to print first 10 numbers in Fibonacci series. Also print their sum.
import java.io.*;
import java.util.*;
class fibo {
	void fibonacci(int n) {
		int i,s,num,sum=0,actual_sum;
		int a=0;
		int b=1;
		num=n;
		System.out.println(a);
		System.out.println(b);
		for(i=3;i<=n;i++){
			s=a+b;
			System.out.println(s);
			a=b;
			b=s;
			sum +=s;
		}
		actual_sum=sum+1;
		System.out.print("Sum of first 10 fibonacci numbers = " +actual_sum);
	}
}
class fibonacci {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter a number :");
		Scanner sc=new Scanner(System.in);
		fibo ob=new fibo();
		n=sc.nextInt();
		ob.fibonacci(n);
	}
}

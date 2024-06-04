/*Write a java program in which you will declare two interface sum and Add inherits these interface
through class Al and display their content.*/
import java.io.*;
import java.util.*;
interface sum {
	void Sum(int a,int b);
}
interface add {
	void Add(int p,int q);
}
class A1 implements sum,add {
	public void Sum(int a,int b) {
		int c=a+b;
		System.out.println("Sum of a and b = "+c);
	}
	public void Add(int p,int q) {
		int r=p+q;
		System.out.println("The sum of p and q = "+r);
	}
	public static void main (String[] args) {
		System.out.println("Enter the value of a and b : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the value of p and q : ");
		int p=sc.nextInt();
		int q=sc.nextInt();
		A1 ob=new A1();
		ob.Sum(a,b);
		ob.Add(p,q);
	}
}
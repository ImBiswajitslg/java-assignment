 //Write java program to print Biggest of 3 Numbers using Logical Operators,
import java.io.*;
import java.util.*;
class Biggest {
	void biggest(int a,int b,int c) {
		int x,y,z;
		x=a;y=b;z=c;
		if (x>y && x>z) { 
			System.out.print("The biggest number entered is " +x);
		}
		if (y>x && y>z) {
			System.out.print("The biggest number entered is " +y);
		}
		if (z>x && z>y) {
			System.out.print("The biggest number entered is " +z);
		}
	}
}
class biggestOfThree {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number :");
		a=sc.nextInt();
		System.out.print("Enter the second number :");
		b=sc.nextInt();
		System.out.print("Enter the third number :");
		c=sc.nextInt();
		Biggest ob=new Biggest();
		ob.biggest(a,b,c);
	}
}
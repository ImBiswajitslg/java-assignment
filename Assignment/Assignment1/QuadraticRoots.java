//Write A Java Program to print Quadratic roots using command line arguments.
import java.io.*;
import java.util.*;
import java.math.*;
class Quad {
	double a,b,c,d,root1,root2;
	Scanner sc=new Scanner(System.in);
	void Quadr() {
		System.out.println("Enter the value of a,b,c , with a ! = 0 :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=((b*b)-(4*a*c));
		if (d>0) {
			root1=(-b + Math.sqrt(d))/(2*a);
			root2=(-b - Math.sqrt(d))/(2*a);
			System.out.println("Roots are real and distinct.");
			System.out.println("Root1 = "+root1);
			System.out.println("Root2 = "+root2);
		}
		else if (d==0) {
			root1=-b/(2*a);
			System.out.println("Roots are real and equal.");
			System.out.println("Both roots are "+root1);
		} else {
			System.out.println("The roots are imaginary.");
		} 
	}
}
class QuadraticRoots {
	public static void main(String[] args) { 
		Quad ob1=new Quad();
		ob1.Quadr(); 
	}
}
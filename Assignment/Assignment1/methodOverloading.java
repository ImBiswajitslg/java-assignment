/*Write a Java Program to define a class, define instance methods and overload them and use them
for dynamic method invocation.*/
import java.io.*;
class overload {
	double l,b;
	void polygon(double a) {
		l=b=a;
		System.out.println("A square is formed having perimeter "+4*l);
	}
	void polygon(double l1,double b1) {
		l=l1;
		b=b1;
		System.out.println("A rectangle is formed having perimeter "+(2*(l+b)));
	}
}
class methodOverloading {
	public static void main(String[] args) {
		overload ob1=new overload();
		ob1.polygon(10.5);
		ob1.polygon(10.5,5.6);
	}
}
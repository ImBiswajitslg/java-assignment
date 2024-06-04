//Write a program to implement multiple inheritance in java.
import java.io.*;
import java.util.*;
interface square {
	void area(int a);
}
interface rectangle {
	void area(int l,int b);
}
class display {
	void show() {
		System.out.println("Area calculated.");
	}
}
class polygon extends display implements square,rectangle {
	public void area(int a) {
		System.out.println("Area of square = "+a*a);
	}
	public void area(int l,int b) {
		System.out.println("Area of rectangle = "+l*b);
	}
}
class ImplementMultipleInheritance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square :");
		int a=sc.nextInt();
		System.out.println("Enter the length and breadth of rectangle :");
		int l=sc.nextInt();
		int b=sc.nextInt();
		polygon obj=new polygon();
		obj.show();
		obj.area(a);
		obj.area(l,b);
	}
}
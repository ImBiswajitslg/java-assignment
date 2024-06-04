//Write a program to demonstrate use of implementing interfaces
import java.io.*;
import java.util.*;
interface polygon {
	void getarea();
	default void getsides() {
		System.out.println("I can get sides .");
	}
}
class rectangle implements polygon {
	public void getarea() {
		int l1=10;
		int b1=5;
		System.out.println("Area of rectangle = "+l1*b1);
	}
	public void getsides() {
		System.out.println("Rectangle has 4 sides .");
	}
}
class square implements polygon {
	public void getarea() {
		int a=5;
		System.out.println("Area of square = "+a*a);
	}
}
class ImplementInterface {
	public static void main(String[] args) {
		rectangle ob1=new rectangle();
		ob1.getarea();
		ob1.getsides();
		square ob2=new square();
		ob2.getarea();
		ob2.getsides();
	}
}
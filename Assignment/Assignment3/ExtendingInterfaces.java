//Write a program to demonstrate use of extending interfaces. import java.lang.*;
import java.io.*;
import java.util.*;
interface A {
	int a=10;
	void callme1();
}
interface B extends A {
	int b=20;
	void callme2();
}
class C implements B {
	public void callme1() {
		System.out.println("Defining the callme1 method of interface A .");
		System.out.println("Value of a*5 = " + a*5);
	}
	public void callme2() {
		System.out.println("Defining the callme2 method of interface B .");
		System.out.println("Value of b*5 = " + b*5);
	}
}
class ExtendingInterfaces {
	public static void main(String[] args) {
		C r;
		C obj=new C();
		r=obj;
		r.callme1();
		r.callme2();
	}
}

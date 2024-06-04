/*Write a program in java to generate an abstract class A also class B inherits the class A. generate the
object for class B and display the text "call me from B".*/
import java.io.*;
import java.util.*;
abstract class A {
	abstract void show();
}
class B extends A {
	void show() {
		System.out.print("Call me from B.");
	}
	public static void main(String[] args) {
		B ob=new B();
		ob.show();
	}
}
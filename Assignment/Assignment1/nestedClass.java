//Write a Java Program to demonstrate use of nested class.
import java.io.*;
import java.util.*;
class building {
	public static class hall {
		hall(int n)
		{
			System.out.println("Office meeting is in hall no " +n);
		}
	}
	building() {
		System.out.println("The building is multistorey.");
	}
}
class nestedClass {
	public static void main(String[] args) {
		building ob1=new building();
		building.hall ob2=new building.hall(7);
	}
}
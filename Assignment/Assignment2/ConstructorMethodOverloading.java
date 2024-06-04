Write a JAVA Program to demonstrate Constructor overloading and Method overloading.
import java.io.*;
class Polygon {
	Polygon(int a) {
		System.out.println("Area of square = "+(a*a));
	}
	Polygon(int l,int b) {
		System.out.println("Area of rectangle = "+(l*b));
	}
	void polygon(int a) {
		System.out.println("Perimeter of square = "+(4*a));
	}
	void polygon(int l,int b) {
		System.out.println("Perimeter of rectangle = "+(2*(l+b)));
	}
}
class ConstructorMethodOverloading {
	public static void main(String[] args) {
		Polygon obj1=new Polygon(10);
		Polygon obj2=new Polygon(15,10);
		obj1.polygon(10);
		obj2.polygon(15,10);
	}
}
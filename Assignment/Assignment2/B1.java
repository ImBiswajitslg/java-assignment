/*Write a Java program that creates a Class namely A that has a private instance variable and
method, a protected instance variable and method, a default instance variable and method, and a
public instance variable and method. Create another Class say B that inherits from A.
i.Show that all except private members are inherited.
ii. Show that an inherited instance variable can be shadowed (with the same or weaker access
visibility) but can be accessed using super keyword in the sub-class.
iii. Show that the reference variable of type A or B can't access an overridden method of A in the
Object of B.*/
import java.io.*;
class A {
	private int p=10;
	protected int q=20;
	int r=30;
	public int s=40;
	private void P(){};
	protected void Q(){};
	void R(){};
	public void S(){};
}
class B1 extends A {
	public int s=500;
	/* private void P()
	{
	System.out.println("Value of private p = "+p);
	}*/
	protected void Q() {
		System.out.println("Value of protected q = "+q);
	}
	void R() {
		System.out.println("Value of default r = "+r);
	}
	public void S() {
		System.out.println("Value of public s = "+s);
		System.out.println("Value of class A's public s = "+super.s);
	}
	public static void main(String[] args) {
		B1 obj=new B1();
		A ref;
		//obj.P();
		obj.Q();
		obj.R();
		obj.S();
		ref=obj;
		ref.R();
	}
}
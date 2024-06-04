/*Write a program to create a class Student2 along with two method getData() printData() to get the
value through argument and display the data in printData. Create the two objects s1,s2 to declare and
access the values from class STtest.*/
import java.io.*;
import java.util.*;
class Student2 {
	String name;
	int roll;
	String address;
	long mob;
	void getData(String n,int r,String a,long m) {
		name=n;
		roll=r;
		address=a;
		mob=m;
	}
	void printData() {
		System.out.println("Student's name is " + name);
		System.out.println("Student's roll is " + roll);
		System.out.println("Student's address is " + address);
		System.out.println("Student's mobile number is " + mob);
	}
}
class STtest {
	public static void main(String[] args) {
		Student2 s1=new Student2();
		s1.getData("Biswajit",23,"Siliguri",8016808440);
		s1.printData();
		Student2 s2=new Student2();
		s2.getData("Subhash",31,"Ambikanagar",9933801037);
		s2.printData();
	}
}
 
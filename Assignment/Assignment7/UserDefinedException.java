/*Write a program to implement the concept of Exception Handling by creating user
defined exceptions.*/
import java.io.*;
class ExcepExam extends Exception {
	String st1;
	ExcepExam(String st2) {
		st1 = st2;
	}
	public String toString() {
		return ("MY Exception occurred :"+st1);
	}
}
class UserDefinedException {
	public static void main(String[] args) {
		try {
			System.out.println("String of try block ");
			throw new ExcepExam("This is my error message for checking in try block ");
		} catch(ExcepExam exp) {
			System.out.println("Catch Block ");
			System.out.println(exp);
		}
	}
}
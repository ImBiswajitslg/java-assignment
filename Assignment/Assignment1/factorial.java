/*Write a java program that calculates factorial of a number.*/
import java.io.*;
import java.util.*;
class fact {
	int show(int n) {
		int num,i;
		int fact=1;
		num=n;
		for(i=1;i<=num;i++) {
		fact=fact*i;
		}
		return fact;
	}
}
class factorial {
	public static void main(String[] args) { 
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find its factorial :")
		n=sc.nextInt();
		fact ob1=new fact();
		System.out.print("The factorial = " +ob1.show(n));
	}
}
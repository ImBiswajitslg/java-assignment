//Write a Java program that prints the season name corresponding to its month number using If-else
//and switch-case statements.
import java.io.*;
import java.util.*;
class season {
	void month(int num) {
		if (num<1 || num>12) {	
		System.out.println("Enter a valid month.");
		return;
		} else {
			switch (num) {
				case 1:
				case 2:
				case 12:
				System.out.println("Winter season");
				break;
				case 3:
				case 4:
				case 5:
				System.out.println("Spring season");
				break;
				case 6:
				case 7:
				case 8:
				System.out.println("Summer season");
				break;
				case 9:
				case 10:
				case 11:
				System.out.println("Autumn season");
				break; 
			}
		} 
	}
}
class seasonName {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a month number between from 1 to 12:");
		int num=sc.nextInt();
		season ob=new season();
		ob.month(num);
	}
}

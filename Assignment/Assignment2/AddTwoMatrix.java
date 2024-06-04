//Write a Java Program to find addition of two marrices.
import java.io.*;
import java.util.*;
class TwoMatrix {
	int i,j,row,column,sum,mat1[][],mat2[][],mat3[][];
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.println("Enter the number of rows :");
		row=sc.nextInt();
		System.out.println("Enter the number of columns :");
		column=sc.nextInt();
		mat1=new int[row][column];
		mat2=new int[row][column];
		mat3=new int[row][column];
		System.out.println("Enter the elements in matrix1 : ");
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements in matrix2 : ");
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
	}
	void add() {
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				sum=0;
				sum=mat1[i][j]+mat2[i][j];
				mat3[i][j]=sum;
			}
		}
	}
	void display() {
		System.out.println("After addition new matrix is :");
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				System.out.print(mat3[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
class AddTwoMatrix {
	public static void main(String[] args) {
		TwoMatrix ob=new TwoMatrix();
		ob.input();
		ob.add();
		ob.display();
	}
}

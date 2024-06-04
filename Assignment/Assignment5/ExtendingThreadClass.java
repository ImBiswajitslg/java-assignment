//Write a program to implement the concept of threading by extending Thread Class.
import java.io.*;
class ThreadA extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("From ThreadA, value of i ="+i);
		}
	}
}
class ThreadB extends Thread {
	public void run() {
		for(int j=1;j<=5;j++) {
			System.out.println("From ThreadB, value of j*2 ="+j*2);
		}
	}
}
class ThreadC extends Thread {
	public void run() {
		for(int k=1;k<=5;k++) {
			System.out.println("From ThreadA, value of k+10 ="+(k+10));
		} 
	}
}
class ExtendingThreadClass {
	public static void main(String[] args) {
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		ThreadC c=new ThreadC();
		a.start();
		b.start();
		c.start();
	}
}
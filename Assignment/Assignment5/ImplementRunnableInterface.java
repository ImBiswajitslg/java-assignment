//Write a program to implement the concept of threading by implementing Runnable Interface.
import java.io.*;
class ThreadA implements Runnable {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("From ThreadA, value of i ="+i);
		}
	}
}
class ThreadB implements Runnable {
	public void run() {
		for(int j=1;j<=5;j++) {
			System.out.println("From ThreadB, value of j*2 ="+j*2);
		}
	}
}
class ThreadC implements Runnable {
	public void run() {
		for(int k=1;k<=5;k++) {
			System.out.println("From ThreadA, value of k+10 ="+(k+10));
		}
	}
}
class ImplementRunnableInterface {
	public static void main(String[] args) {
		ThreadA a=new ThreadA();
		Thread t1=new Thread(a);
		ThreadB b=new ThreadB();
		Thread t2=new Thread(b);
		ThreadC c=new ThreadC();
		Thread t3=new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}
}

/*Write a java program for multithread in which user thread and thread started from main
method invoked at a time each thread sleep for 1 sec.*/
import java.io.*;
import java.util.*;
class ThreadA extends Thread {
	public void run() {
		System.out.print("Enter the number of seconds :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n +" second timer set with 1 second interval.");
		for(int i=1;i<=n;i++) {
			try {
				sleep(1000);
			} catch(Exception e){}
			System.out.println(i+" second");
		}
	}
}
class Sleep1Sec {
	public static void main(String[] args) {
		ThreadA obj=new ThreadA();
		obj.start();
	}
}
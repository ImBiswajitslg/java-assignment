//Write a java program in which thread sleep for 5 sec and change the name of thread.
import java.io.*;
class ThreadA extends Thread {
	public void run() {
		System.out.println("ThreadA starts execution.");
		try {
			sleep(5000);
		}
		catch(Exception e){}
		System.out.println("ThreadA completes execution.");
		System.out.println(Thread.currentThread().getName()+" is the new name of the Thread.");
	}
}
class ThreadSleep {
	public static void main(String[] args) {
		ThreadA obj=new ThreadA();
		obj.setName("Thread1");
		obj.start();
	}
}
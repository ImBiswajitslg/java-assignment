//Write a JAVA program using Synchronized Threads, which demonstrates Producer Consumer concept.
import java.io.*;
class consumer {
	int amount=10000;
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw.");
		if(this.amount<amount) {
			System.out.println("Less Balalnce,can't be withdrawn");
			try{wait();}catch(Exception e){}
		}
		this.amount=this.amount-amount;
		System.out.println("Amount withdrawn");
	}
	synchronized void deposite(int amount) {
		System.out.println("Going to deposite");
		this.amount+=amount;
		System.out.println("Deposite completed.");
		notify();
	}
}
class SyncedProducerConsumer {
	public static void main(String[] args) {
		consumer c=new consumer();
		Thread t1=new Thread(new Runnable() {
			public void run() {
				c.withdraw(15000);
			}
		});
		t1.start();
		Thread t2=new Thread(new Runnable() {
			public void run() {
				c.deposite(10000);
			}
		});
		t2.start();
	}
}
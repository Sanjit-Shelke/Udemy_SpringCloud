package com.practise;

public class Thread1 extends Thread{

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		Thread1 th1 = new Thread1();
		Thread1 th2 = new Thread1();
			
		th1.setName("first");
		th2.setName("second");
		
		th1.start();
		th2.start();
	}

	@Override
	public void run() {
		super.run();
		
		System.out.println(Thread.currentThread());
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread"+i);
		}
	}
}

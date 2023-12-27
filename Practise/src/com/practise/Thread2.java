package com.practise;

import javax.sql.rowset.spi.SyncFactory;

public class Thread2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		
		Thread2 th1 = new Thread2();
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th1);
		
		t1.start();
		t2.start();
	}

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++)
		{
			System.out.println("Thread"+i);
		}
	}

}

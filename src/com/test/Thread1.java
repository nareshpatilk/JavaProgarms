package com.test;

public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new CheckThread());
		Thread t2 = new Thread(new CheckThread());
		checkState(t1, "T1");
		checkState(t1, "T2");
		t1.start();
		t2.start();
		checkState(t1, "T1");
		checkState(t1, "T2");
		t1.join();
		checkState(t1, "T1");
		t2.sleep(100);
		checkState(t1, "T2");
	}

	static void checkState(Thread t, String Name) {
		System.out.println(" thread "+Name+" state  : "+t.getState()+ " id :"+t.getId());
	}
}


class CheckThread implements Runnable {
	
	public void run() {
		System.out.println("check Thread started");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

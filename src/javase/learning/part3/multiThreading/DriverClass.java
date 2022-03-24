package javase.learning.part3.multiThreading;

public class DriverClass {
	
	//New -> Runnable -> Running -> wait -> notify/notifyAll -> dead/terminated
	
	public static void main(String[] args) throws InterruptedException {
		MyThread m1 = new MyThread();
		m1.setName("My Thread");
		m1.start();
//		m1.setPriority(10);
//		m1.setDaemon(true);
		
		m1.join();
		
		MyRunnable mr = new MyRunnable();
		Thread t2 = new Thread(mr);
		t2.setName("My Runnable");
		t2.start();
		
		t2.join();
		
		for (int i = 1; i <= 100; i++) {
			if (i == 50) {
				System.out.println("going to sleep for 2 seconds");
				Thread.sleep(2000);
			}
			System.out.println(Thread.currentThread().getName()+" -> "+i);
		}
	}
}

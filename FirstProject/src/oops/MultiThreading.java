package oops;

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		
		long startTime = System.currentTimeMillis();
		
		Thread t1 = new Thread(()->{
			System.out.println("t1 started");
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t1 ended");
		});
		t1.start();
		t1.join();
		
		Thread t2 = new Thread(()->{
			System.out.println("t2 started");
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t2 ended");
		});
		t2.start();
		t2.join();
		
		Thread t3 = new Thread(()->{
			System.out.println("t3 started");
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t3 ended");
		});
		t3.start();
		t3.join();
		
		Thread t4 = new Thread(()->{
			System.out.println("t4 started");
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t4 ended");
		});
		t4.start();
		t4.join();
		
		Thread t5 = new Thread(()->{
			System.out.println("t5 started");
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t5 ended");
		});
		t5.start();
		t5.join();
		
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken by all threads - " + (endTime - startTime));
	}

}

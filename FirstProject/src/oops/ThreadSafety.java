package oops;

class Process implements Runnable{
	
	int x;
	static int y = 100;
	String lock = "Get me, to set x";

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
				synchronized (lock) {
					x++;
					x+=2;
					y-=3;
				}
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
//			synchronized(lock) {
//				y-=3;
//			}
			System.out.println("X is " + x + ", y is " + y + ", thread is " + Thread.currentThread().getName());
		}
	}
	
}

public class ThreadSafety {

	public static void main(String[] args) throws InterruptedException {
		Process process = new Process();
		Thread t1 = new Thread(process, "t1");
		Thread t2 = new Thread(process, "t2");
		t1.start();
		t2.start();
		t2.join();
		System.out.println("X is " + process.x);
		System.out.println("Y is " + process.y);

	}

}

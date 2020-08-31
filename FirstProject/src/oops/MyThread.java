package oops;

class HeavyWork implements Runnable{

	@Override
	public void run() {
		System.out.println("Doing heavy work...");
	}
	
}

class AnotherHeavyWork extends Thread{

	@Override
	public void run() {
		System.out.println("Doing heavy work...");
	}
	
}

public class MyThread {
	
	//1. Create a Thread object - it requires a Runnable object which is impossible
	//because Runnable is interface, so we are doing the following-
	//2. Create a class
	//3. Implement Runnable interface
	//4. Override run()
	//5. Create object of this class
	//6. Upcast object of class to the Runnable scope
	//7. Pass this upcasted object to the Thread constructor 
	//8. Start the thread

	public static void main(String[] args) {
		
		Runnable runnable = new HeavyWork();
		
		Thread t1 = new Thread(runnable);
		t1.start();
		
		Thread thread = new AnotherHeavyWork();
		
		Thread t6 = new Thread(thread);
		t6.start();
		
		
		
		
		
		
		Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		Thread t2 = new Thread(runnable2);
		t2.start();
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				
			}
		};
		Thread t7 = new Thread(thread2);
		t7.start();
		
		
		
		
		
		
		
		
		
		
		Runnable runnable3 = new Runnable(){
			@Override
			public void run() {
				
			}
		};
		Thread t3 = new Thread(runnable3);
		t3.start();
		
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		t4.start();
		
		Thread t8 = new Thread(new Thread() {
			@Override
			public void run() {
				
			}
		});
		t8.start();
		
		
		
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}).start();
		
		new Thread(new Thread() {
			@Override
			public void run() {
				
			}
		}).start();
		
		
		
		
		new Thread(()->System.out.println("Thread started...")).start();
		
		
		
		
		new Thread(() -> {
			System.out.println();
			System.out.println();
		}).start();
		
	}

}
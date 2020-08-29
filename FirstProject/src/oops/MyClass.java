package oops;

class HeavyWork implements Runnable{

	@Override
	public void run() {
		System.out.println("Doing heavy work...");
	}
	
}

public class MyClass {

	public static void main(String[] args) {
		
		Runnable runnable = new HeavyWork();
		
		Thread t1 = new Thread(runnable);
		t1.start();
		
		Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		Thread t2 = new Thread(runnable2);
		t2.start();
		
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
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}).start();
	}

}

//1. Create a Thread object - it requires a Runnable object which is impossible
//because Runnable is interface, so we are doing the following-
//2. Create a class
//3. Implement Runnable interface
//4. Override run()
//5. Create object of this class
//6. Upcast object of class to the Runnable scope
//7. Pass this upcasted object to the Thread constructor 
//8. Start the thread
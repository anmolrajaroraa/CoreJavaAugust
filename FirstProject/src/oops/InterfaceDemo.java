package oops;

// interface is 100% abstract (Java 7)
// what to do
// how to do - it is defined by classes
// interface is like a skeleton - declarations of functions
// each fn in interface has public default keywords already applied
// each variable in interface is by default - final and static

interface AccountInterface{
	
	public final static String BANK_NAME = "XYZ Bank"; 
	
	public abstract void deposit();
	void withdraw();
	void roi();
}

interface AccountInterface2{
	
	public final static String BANK_NAME = "ABC Bank"; 
	
	public abstract void deposit();
	void withdraw();
	void roi();
}

class NewSavingsAccount extends GenericTypes implements AccountInterface, AccountInterface2{

	String bankName = AccountInterface.BANK_NAME;
	String bankName2 = AccountInterface2.BANK_NAME;
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roi() {
		// TODO Auto-generated method stub
		
	}	
}

class NewCurrentAccount implements AccountInterface{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roi() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {

	}

}

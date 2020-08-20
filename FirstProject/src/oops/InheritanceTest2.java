package oops;

abstract class Account extends Object{
	int accountNo;
	String customerName;
	int balance;
	String bankName;
	final static int MIN_BALANCE_REQUIRED = 1000;
	
	private Account() {  // father
		bankName = "XYZ Bank";
		System.out.println("Bankname value set..");
	}
	
	public Account(int accountNo, String customerName, int balance) { // me
		this();  // called my father
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.balance = balance;
		System.out.println("acNo cuName bal set..");
	}
	
	void deposit() {
		System.out.println("Account deposit");
	}
	void withdraw() {
		System.out.println("Account withdraw");
	}
	abstract void roi();
	
	final void KYC() {
		System.out.println("Know your customer...");
	}
}

class SavingsAccount extends Account{
	public SavingsAccount(int accountNo, String customerName, int balance) {  // fiancee
		super(accountNo, customerName, balance);  // called me
		System.out.println("Going to finish SA cons...");
	}

	@Override
	void roi() {
		// TODO Auto-generated method stub
		System.out.println("3% interest rate given");
	}
}

class CurrentAccount extends Account{
	public CurrentAccount(int accountNo, String customerName, int balance) {  // fiancee
		super(accountNo, customerName, balance);  // called me
		System.out.println("Going to finish SA cons...");
	}
	@Override
	void deposit() {
		System.out.println("CurrentAccount deposit");
		System.out.println("PAN verify");
	}
	@Override
	void roi() {
		// TODO Auto-generated method stub
		System.out.println("7% interest rate taken");
	}
}

class DematAccount extends Account{
	public DematAccount(int accountNo, String customerName, int balance) {  // fiancee
		super(accountNo, customerName, balance);  // called me
		System.out.println("Going to finish SA cons...");
	}
	void withdraw(int limit) {
		System.out.println("Limit is of $2500 shares");
	}
	@Override
	void roi() {
		// TODO Auto-generated method stub
		System.out.println("5% commission taken");
	}
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		// IS A (inheritance), HAS A (aggregation)
		// Student HAS A course
		// Course HAS A Teacher
		// Teacher HAS A Address
		// SavingsAccount IS A Account
		// CarLoan IS A Loan
		// Mercedes IS A Car
		// Mercedes HAS A Accessory
		
		// All constructors private - no inheritance (no super call can be made)
		//	- no object can be created
		// abstract class - no object creation
		// you can build abstract methods
		
		// why final? - we dont want anyone to inherit and modify our class
		// as we have provided everything that is needed in a class
		// why abstract?
		// final vs abstract
		// final abstract can be used together?
		
//		Account account = new Account(104, "Jenny", 20000);
//		account.withdraw();
		
		System.out.println("Going to create SA object");
		SavingsAccount sa = new SavingsAccount(110, "John Smith", 25000);    //  fiancee's father
		sa.withdraw();
		sa.deposit();
		sa.roi();
		sa.KYC();
		
		CurrentAccount ca = new CurrentAccount(111, "Tom", 35000);
		ca.deposit();
		ca.withdraw();
		
		DematAccount da = new DematAccount(112, "Frank", 40000);
		da.deposit();
		da.withdraw();
		da.withdraw(10000);
	}

}

package oops;

interface Player{
	public static final int MAX_POWER = 100;
	int MIN_POWER = 10;
	
	public static void showCharacteristics() {
		System.out.println("Max power: " + MAX_POWER);
		System.out.println("Min power: " + MIN_POWER);
	}
	
	public abstract void kick();
	void punch();
	void attack();
	void defense();
	
	default void entry() {
		System.out.println("Player will enter in a cool walking style");
	}
	default void startPower() {
		System.out.println("Starting health will be " + MAX_POWER);
	}
}

class Bison implements Player{

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void entry() {
		System.out.println("Player will enter in a cool flying style");
	}
	
}

class Dhalsim implements Player{

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
	
	void throwFire() {
		
	}
	
}


public class InterfaceDemo3 {

	public static void main(String[] args) {
		Bison bison = new Bison();
		bison.startPower();
		bison.entry();
		bison.kick();
		bison.punch();
		bison.attack();
		bison.defense();
		Player.showCharacteristics();
		System.out.println("Bison's max power is " + Player.MAX_POWER);
		
		Dhalsim dhalsim = new Dhalsim();
		dhalsim.startPower();
		dhalsim.entry();
		dhalsim.kick();
		dhalsim.punch();
		dhalsim.attack();
		dhalsim.defense();
		dhalsim.throwFire();
		Player.showCharacteristics();
		System.out.println("Bison's max power is " + Player.MAX_POWER);
	}

}

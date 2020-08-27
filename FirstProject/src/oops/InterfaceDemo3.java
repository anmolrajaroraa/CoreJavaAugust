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

interface StarPlayer{
	int MIN_POWER = 20;
	void hide();
	void fly();
}

interface HybridPlayer extends Player, StarPlayer{
	default void testHybridPlayer() {
		System.out.println(Player.MIN_POWER);
		System.out.println((StarPlayer.MIN_POWER));
	}
	default void throwFire() {
		System.out.println("I an throw fire");
	}
}

class Bison implements Player, StarPlayer{

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

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

class Dhalsim implements HybridPlayer{

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
	public void throwFire() {
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
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
		bison.fly();
		bison.hide();
		Player.showCharacteristics();
		System.out.println("Bison's max power is " + Player.MAX_POWER);
		
		Dhalsim dhalsim = new Dhalsim();
		dhalsim.startPower();
		dhalsim.entry();
		dhalsim.kick();
		dhalsim.punch();
		dhalsim.attack();
		dhalsim.defense();
		dhalsim.hide();
		dhalsim.fly();
		dhalsim.throwFire();
		dhalsim.testHybridPlayer();
		Player.showCharacteristics();
		System.out.println("Bison's max power is " + Player.MAX_POWER);
	}

}

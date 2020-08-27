package oops;

public class Climber implements CarInterface{
	void sixSpeedGearBox() {
		System.out.println("Switch gears automatically");
	}
	void powerWindowWithSunroof() {
		System.out.println("Handle window automatically");
	}
	@Override
	public void gears() {
		sixSpeedGearBox();
	}
	@Override
	public void window() {
		powerWindowWithSunroof();
	}
}
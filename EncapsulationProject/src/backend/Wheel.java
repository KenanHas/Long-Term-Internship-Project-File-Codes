package backend;

public class Wheel {

	private int wheelCount;
	private int jantCount;
	private boolean isAuxiliaryWheel = false;

	Wheel(int wheelCount, int jantCount) {
		this.wheelCount = wheelCount;
		this.jantCount = jantCount;

		System.out.println("This bike has got " + wheelCount + " wheels.");
		System.out.println("This bike has got " + jantCount + " jants.");
	}

	public boolean isAuxiliaryWheel() {
		return isAuxiliaryWheel;
	}

	public void setAuxiliaryWheel(boolean isAuxiliaryWheel) {
		this.isAuxiliaryWheel = isAuxiliaryWheel;
	}

}

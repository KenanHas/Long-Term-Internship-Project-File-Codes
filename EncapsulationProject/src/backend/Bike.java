package backend;

public class Bike {

	private String bikeColour;
	private int personCount;

	Sele sele;
	Pedal pedal;
	Fren fren;
	Wheel wheel;

	Bike(String bikeColour, int personCount) {

		this.bikeColour = bikeColour;
		this.personCount = personCount;
		
		System.out.println("Bike Info");
		System.out.println("Colour of the bike is "+bikeColour);
		System.out.println("This bike is moving "+personCount+" person.");
		System.out.println();
		
		System.out.println("Pedal Info");
		pedal = new Pedal(2, "plastic");
		System.out.println();
		
		System.out.println("Sele Info");
		sele = new Sele(20);
		sele.isSoft(false);
		System.out.println();
		
		System.out.println("Wheel Info");
		wheel = new Wheel(2, 21);
		System.out.println();
	}

	public void go() {
		pedal.setPedalPress(false);
		if (pedal.isPedalPress()) {
			System.out.println("This bike is moving");
		} 
		else {
			System.out.println("This bike isn't moving");
		}
	}

	public void fast() {
		wheel.setAuxiliaryWheel(true);
		if (wheel.isAuxiliaryWheel()) {
			System.out.println("This bike hasn't got auxiliary wheel.");
			System.out.println("This bike is fast.");
		} 
		else {
			System.out.println("This bike has got auxiliary wheel.");
			System.out.println("This bike is slow.");

		}
	}

}

package backend;

public class Pedal {

	private int pedalCount;
	private String rawMaterials;
	private boolean isPedalPress;

	Pedal(int pedalCount, String rawMaterials) {
		this.pedalCount = pedalCount;
		this.rawMaterials = rawMaterials;
		System.out.println("This bike has got " + pedalCount+" pedals.");
		System.out.println("Pedal of the bike makes " + rawMaterials+" material.");
	}

	public boolean isPedalPress() {
		return isPedalPress;
	}

	public void setPedalPress(boolean isPedalPress) {
		this.isPedalPress = isPedalPress;
	}
	
	
	
}


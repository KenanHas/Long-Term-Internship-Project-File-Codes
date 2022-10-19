package backend;

public class Sele {

	private int height;
	private boolean isSoft;

	Sele(int height) {
		this.height = height;
		System.out.println("Height of the sele "+height+" cm.");
	}

	public void isSoft(boolean isSoft) {
		this.isSoft = isSoft;
		if (isSoft) {
			System.out.println("This sele is soft");
		} 
		else {
			System.out.println("This sele isn't soft. İt is hard.");
		}
		
	}
}

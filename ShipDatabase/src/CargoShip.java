
public class CargoShip extends Ship {

	private int capasity;

	CargoShip() {
		setCapasity(500);
	}

	CargoShip(int capasity) {
		setCapasity(capasity);
	}

	CargoShip(String name, String year, int capasity) {
		super(name, year);
		setCapasity(capasity);
	}

	public int getCapasity() {
		return capasity;
	}

	public void setCapasity(int capasity) {
		this.capasity = capasity;
	}

	public String toString() {
		return (super.toString() + " With a maximum capasity of " + getCapasity() + "tonnage.\n\n");
	}

}

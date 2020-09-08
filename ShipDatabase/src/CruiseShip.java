
public class CruiseShip extends Ship {

	private int numPassengers;

	CruiseShip() {
		setNumPassengers(200);
	}

	CruiseShip(int numPassengers) {
		setNumPassengers(numPassengers);
	}

	CruiseShip(String name, String year, int numPassengers) {
		super(name, year);
		setNumPassengers(numPassengers);
	}

	public int getNumPassengers() {
		return numPassengers;
	}

	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}

	public String toString() {
		return (super.toString() + " With a maximum occupancy of " + numPassengers + "passengers.\n\n");
	}
}

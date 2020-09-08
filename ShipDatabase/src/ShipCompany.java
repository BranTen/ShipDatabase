import java.util.ArrayList;

public class ShipCompany {
	ArrayList<Ship> ships = new ArrayList<Ship>();

	ShipCompany() {

	}

	public void add(Ship ship) {
		ships.add(ship);
	}

	public String toString() {
		String message = "";

		for (int i = 0; i < ships.size(); i++) {
			message = message + ships.get(i).toString();
		}

		return (message);
	}
}

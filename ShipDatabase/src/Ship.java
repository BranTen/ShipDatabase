
public class Ship {

	private String name = "no name";
	private String year = "no year";

	public Ship() {

	}

	public Ship(String name, String year) {
		this.name = name;
		this.year = year;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String toString() {

		return ("The " + name + " Ship was built in " + year);

	}

}

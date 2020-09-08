
/*
* Class: CMSC201
* Instructor: Monshi
* Description: (this program prompts the user to enter the ships name and build year and then displays the information
* once the user has entered the information)
* Due: 04/19/2016 
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: Brandon Tennyson
*/

import java.util.Scanner;

public class ShipDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ShipCompany shipCompany = new ShipCompany();

		String a = null;
		do {
			System.out.println("Enter ships name: ");
			String name = input.nextLine();
			System.out.println("Enter " + name + " build year: ");
			String year = input.nextLine();
			System.out.println("Enter 1 for Cruise ship or 2 for Cargo Ship: ");
			int type = input.nextInt();

			if (type == 1) {// Cruise ship
				System.out.println("Enter number of passengers for " + name + ":");
				int passenger = input.nextInt();
				CruiseShip cruiseShip = new CruiseShip(name, year, passenger);
				shipCompany.add(cruiseShip);
				input.nextLine();
				System.out.println("do you want to enter another ship's information(y/n)? ");
				a = input.next();
				input.nextLine();

			} else {
				if (type == 2) {// Cargo Ship
					System.out.println("Enter number of capasity (tonnage) for " + name + ":");
					int capasity = input.nextInt();
					CargoShip cargoShip = new CargoShip(name, year, capasity);
					shipCompany.add(cargoShip);
					input.nextLine();
					System.out.println("do you want to enter another ship's information(y/n)? ");
					a = input.next();
					input.nextLine();

				} else {
					System.out.println("enter a 1 or 2");

				}

			}

		} while (a.equalsIgnoreCase("y"));
		System.out.println(shipCompany);
		input.close();

	}

}

package decorator;

import java.util.Scanner;

public class CarLotDriver {
	private Scanner scanner;

	public CarLotDriver() {
		scanner = new Scanner(System.in);
	}

	public void runDriver() {
		Vehicle vehicle =  getVehicle();
		System.out.println("\n******* Our new Vehicle *******");
		System.out.println(vehicle);

		Vehicle decoratedVehicle = new Rims(new Paint(vehicle, getColor()));
		System.out.println("\n******* We decorated our Car *******\n");
		System.out.println(decoratedVehicle);
	}

	private Vehicle getVehicle() {
		while(true) {
			System.out.print("What type of vehicle do you want (C)ar or (T)ruck: ");
			String type = scanner.nextLine().toLowerCase();

			if(type.equals("t")){
				return new Truck();
			}
			else if(type.equals("c")){
				return new Car();
			} else if(type.equals("q")){
				return null;
			}
			System.out.println("Invalid input");
		}
	}

	private String getColor() {
		System.out.print(
				"What color would you like to paint your Vehicle (Enter either Red, Green, Purple, Blue, Yellow, Cyan, or None: ");
		return scanner.nextLine().toLowerCase();
	}
	public static void main(String[] args) {
		CarLotDriver carLot = new CarLotDriver();
		carLot.runDriver();
	}
}

package strategy;

import java.util.Scanner;

public class FootballDriver {
	private Scanner scanner;

	public FootballDriver() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to our football play generator.");
	}

	public void play() {
		QuarterBack qb = new QuarterBack("Jimmy", "Rambler", "The 6-7s");
		
		while(true) {
			System.out.println(qb + " What would you like to do?");

			if(getCommand() == 1) {
				qb.play();
				
			} else {
				System.out.println("Have a nice day.");
				return;
			}
		}		
	}

	private int getCommand() {
		while (true) {
			System.out.print("\n1. Execute Play, 2. Quit: ");
			try {
				int option = Integer.parseInt(scanner.nextLine().trim());

				if (option >= 1 && option <= 2) {
					return option;
				}
			} catch (Exception e) {
			}
			System.out.println("Please enter a valid number between 1 and 2.");
		}

	}

	public static void main(String[] args) {
		FootballDriver football = new FootballDriver();
		football.play();
	}

}

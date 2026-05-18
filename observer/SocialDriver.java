package observer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Driver class that runs the social media observer program. It creates an influencer, creates observers, and shows how they react when the influencer shares thoughts and promotes items.
 * @author Mi'Kayla Brown
 */

// Imports necessary classes from the observer package
public class SocialDriver {

	private Scanner scanner;
	private Influencer golfer;
	private Observer holeScoreDisplay;
	private Observer roundScoreDisplay;

	/**
	 * Creates a SocialDriver object and sets up the scanner.
	 */
	public SocialDriver() {
		scanner = new Scanner(System.in);
	}

	/**
	 * Runs the main part of the program. It creates the influencer and observers, then makes the influencer share a thought and promote an item.
	 */
	public void run() {
		Influencer gabby = new Influencer(("Gabby"), getLogo());
		Observer cindy = new BlindFollower(gabby, "Cindy");
		Observer solita = new Critic(gabby, "Solita");

		gabby.shareThought("\"If it’s not posted, did I even experience it?\"");

		Item lipstick = new Item("Premium Red Lipstick", "Glow glow glow", 45.50);
		gabby.promoteItem(lipstick, "\"Just manifested this… BYE NOW!\"");
	}

	/**
	 * Creates and returns the ASCII logo used for the influencer.
	 * @return The logo as an ArrayList of strings
	 */
	private ArrayList<String> getLogo() {
		ArrayList<String> logo = new ArrayList<String>();
		
		logo.add("    .. ..");
		logo.add("  .'  `  `.");
		logo.add(".'_.-...-._`.");
		logo.add(" `.       .'");
		logo.add("   `-...-'");

		return logo;
	}

	/**
	 * Clears the console screen.
	 */
	private void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	/**
	 * Starts the program.
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		SocialDriver driver = new SocialDriver();
		driver.run();
	}
}
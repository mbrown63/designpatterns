package observer;

import java.util.ArrayList;
import java.util.Scanner;

public class SocialDriver {
	private Scanner scanner;
	private Influencer golfer;
	private Observer holeScoreDisplay;
	private Observer roundScoreDisplay;

	public SocialDriver() {
		scanner = new Scanner(System.in);
	}

	public void run() {
		Influencer gabby = new Influencer(("Gabby"), getLogo());
		Observer cindy = new BlindFollower(gabby, "Cindy");
		Observer solita = new Critic(gabby, "Solita");

		gabby.shareThought("\"If it’s not posted, did I even experience it?\"");

		Item lipstick = new Item("Premium Red Lipstick", "Glow glow glow", 45.50);
		gabby.promoteItem(lipstick, "\"Just manifested this… BYE NOW!\"");
	}

	private ArrayList<String> getLogo() {
		ArrayList<String> logo = new ArrayList<String>();
		
		logo.add("    .. ..");
		logo.add("  .'  `  `.");
		logo.add(".'_.-...-._`.");
		logo.add(" `.       .'");
		logo.add("   `-...-'");

		return logo;
	}

	private void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void main(String[] args) {
		SocialDriver driver = new SocialDriver();
		driver.run();
	}
}

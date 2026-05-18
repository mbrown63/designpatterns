package observer;

/**
 * Represents a follower who reacts critically to everything an influencer says or promotes.  
 * @author Mi'Kayla Brown
 */
public class Critic extends Observer {

    /**
     * Creates a Critic object using the influencer they follow and the critic's name.
     * @param influencer The influencer being followed
     * @param name The name of the critic
     */
    public Critic(Influencer influencer, String name) {
        super(influencer, name);
    }

    /**
     * Displays a reaction when the influencer shares a thought and the Critic responds in a dramatic and judgmental way.
     * @param thought The thought shared by the influencer
     */
    public void hearThought(String thought) {

        // Prints the influencer's thought message in red
        System.out.println(RED + "Eeek did you heaar what " + influencer.getName() + " just said: " + thought + RESET);

    }

    /**
     * Displays a reaction when the influencer promotes an item while the Critic questions whether the item is actually worth buying.
     * @param item The item being promoted
     * @param message The promotion message from the influencer
     */
    public void hearPromotion(Item item, String message) {

        // Prints a message questioning the influencer's recommendation
        System.out.println(RED + influencer.getName() + " just recommended " + item.getName() + " do you think it's worth it? " + RESET);
    }
}
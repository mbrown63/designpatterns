package observer;

/**
 * Represents a follower who blindly trusts and supports everything an influencer says or recommends. 
 * @author Mi'Kayla Brown
 */
public class BlindFollower extends Observer {

    /**
     * Creates a BlindFollower object using the influencer they follow and the follower's name.
     * @param influencer The influencer being followed
     * @param name The name of the follower
     */
    public BlindFollower(Influencer influencer, String name) {
        super(influencer, name);
    }

    /**
     * Displays a message when the influencer shares a thought. The BlindFollower reacts positively to everything said.
     * @param thought The thought shared by the influencer.
     */
    public void hearThought(String thought) {

        // Prints the follower's name in blue
        System.out.println(BLUE + name + ";" + RESET);

        // Prints the influencer's thought message
        System.out.println(BLUE + influencer.getName() + " is so insightful listen to this: " + thought + RESET);
    }

    /**
     * Displays a message when the influencer promotes an item. The BlindFollower immediately buys the item because it was recommended by the influencer.
     * @param item The item being promoted
     * @param message The promotion message from the influencer
     */
    public void hearPromotion(Item item, String message) {

         // Prints a message showing the follower bought the item
         System.out.println(BLUE + "I totally just bought " + item.getName() + " because " + influencer.getName() + " recommended it! " + RESET);
    }
}
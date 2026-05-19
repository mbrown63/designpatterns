package observer;
public class BlindFollower extends Observer {

    public BlindFollower(Influencer influencer, String name) {
        super(influencer, name);
    }

    
    public void hearThought(String thought) {
        System.out.println(BLUE + name + ";" + RESET);
        System.out.println(BLUE + influencer.getName() + " is so insightful listen to this: " + thought + RESET);
    }
    public void hearPromotion(Item item, String message) {
         System.out.println(BLUE + "I totally just bought " + item.getName() + " because " + influencer.getName() + " recommended it! " + RESET);
    }
} 
package observer;

public class Critic extends Observer {

    public Critic(Influencer influencer, String name) {
        super(influencer, name);
    }

    public void hearThought(String thought) {
        System.out.println(RED + "Eeek did you heaar what " + influencer.getName() + " just said: " + thought + RESET);

    }
    public void hearPromotion(Item item, String message) {
        System.out.println(RED + influencer.getName() + " just recommended " + item.getName() + " do you think it's worth it? " + RESET);
    }
}

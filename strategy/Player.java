package strategy;

/**
 * Player class represents the player in the game. It contains the player's information and defines the structure for executing a play.
 * @author Mi'Kayla Brown
 */

public abstract class Player {
    private String firstName;
    private String lastName;
    private String team;
    protected PlayBehavior playBehavior;
   
   /**
    * It initializes the player's first name, last name, and team.
    * @param firstName the player's first name
    * @param lastName the player's last name
    * @param team the player's team
    */
    public Player(String firstName, String lastName, String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
    }

    /**
     * Sets the play behavior for the player.
     */
    protected abstract void setPlayBehavior();

    /**
     * Executes the player's play based on the current play behavior.
     */
    public void play() {
        setPlayBehavior();
        playBehavior.play();
    }


    /**
     * Returns a string representation of the player.
     * @return a string containing the player's first name, last name, and team
     */
    public String toString() {
        return firstName + " " + lastName + " - " + team;
    }
}

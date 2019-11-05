

package starbucks;

/** Settings Screen */
public class Settings extends Screen implements IKeyPadObserver {
    private AddCard addCard;

    public Settings() {

        addCard = new AddCard() ;
    }
    /**
     * Send Touch Events to the Chain
     * @param x Touch X Coord.
     * @param y Touch Y Coord.
     */
    @Override
    public void touch(int x, int y) {

        if(( x == 1 || x == 2 || x == 3 ) && y == 1) {
            Frame.getInstance().setCurrentScreen(addCard);
        }
    }
    /**
     * Get Display Contents
     * @return Display Contents
     */
    @Override
    public String display() {
        String out = "";
        out += "Add Card\n";
        out += "Delete Card\n";
        out += "Billing\n";
        out += "Passcode\n\n";
        out += "About|Terms\n";
        out += "Help";
       return out;
    }
    /**
     * Key Event to Notify Observers
     * @param numKeys Number of Digits So Far
     * @param key     Key/Digit Pressed
     */
    @Override
    public void keyEventUpdate(int numKeys, String key) {

    }
}

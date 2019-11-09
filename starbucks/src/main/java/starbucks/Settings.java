

package starbucks;

/** Settings Screen */
public class Settings extends Screen implements IKeyPadObserver {

    public Settings() {
    }
    /**
     * Send Touch Events to the Chain
     * @param x Touch X Coord.
     * @param y Touch Y Coord.
     */
    @Override
    public void touch(int x, int y) {

        if(isaBoolean(x, y)) {
            Frame.getInstance().setCurrentScreen(new AddCard());
        }
    }
    /**
     * Touch Events
     * @param x Touch X Coord.
     * @param y Touch Y Coord.
     * @return if is touched(1,1),(2,1) or (3,1)
     */
    private boolean isaBoolean(int x, int y) {
        return ( x == 1 || x == 2 || x == 3 ) && y == 1;
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

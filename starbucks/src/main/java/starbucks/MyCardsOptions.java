

package starbucks;

/** My Card Options Screen */
public class MyCardsOptions extends Screen
{
    private MyCardsMoreOptions mycardsmoreoptions;
    public MyCardsOptions()
    {
        mycardsmoreoptions = new MyCardsMoreOptions();
    }
    /**
     * Get Display Contents
     * @return Display Contents
     */
    @Override
    public String display() {
        String value = "";
        value += "Reload\n";
        value += "Refresh\n";
        value += "More Options\n";
        value += "Cancel";
        return value;
    }
    /**
     * Send Touch Events to the Chain
     * @param x Touch X Coord.
     * @param y Touch Y Coord.
     */
    @Override
    public void touch(int x, int y) {
        if(isaBoolean(x, y)) {
            Frame.getInstance().setCurrentScreen(mycardsmoreoptions);
        }
    }
    /**
     * Touch Events
     * @param x Touch X Coord.
     * @param y Touch Y Coord.
     * @return if is touched(1,7),(2,7) or (3,7)
     */
    private boolean isaBoolean(int x, int y) {
        return (x == 1 || x == 2 || x == 3) && y == 7;
    }
}

package starbucks;
/** Card ID */
public class CardID  implements ITouchEventHandler, IDisplayComponent, IKeyPadObserver{
    ITouchEventHandler nextHandler ;
    private StringBuilder cardID = new StringBuilder();
    /**
     * Return Display Component Contents
     * @return Display Component Contents
     */
    @Override
    public String display() {
        String value = "[" ;
        value += cardID.toString();
        value += "]";
        return value  ;

    }
    /**
     * Add A Child Component
     * @param c Child Component
     */
    @Override
    public void addSubComponent(IDisplayComponent c) {

    }
    /**
     * Key Event to Notify Observers
     * @param c Number of Digits So Far
     * @param key     Key/Digit Pressed
     */
    @Override
    public void keyEventUpdate(int c, String key) {
        if (key != " ") {
            System.err.println("Key: " + key);
            if (key == "X") {
                if (cardID.length() > 0) {
                    cardID.deleteCharAt(cardID.length() - 1);
                }

            } else {
                if (cardID.length() < 9) {
                    cardID.append(key);
                }

            }
        }
    }
    /**
     * Touch Event at X and Y
     * @param x X Coord
     * @param y Y Coord
     */
    @Override
    public void touch(int x, int y) {
        if ( nextHandler != null )
            nextHandler.touch(x,y) ;
    }
    /**
     * Set Next Handler in Event Chain
     * @param next Next Handler Object
     */
    @Override
    public void setNext(ITouchEventHandler next) {
        nextHandler = next ;
    }
    /**
     * return if CardCode is complete.
     * @return true or false.
     */
    public boolean isComplete() {
         return cardID.length() == 9 ;
    }
    /**
     * return CardCode
     * @return cardCode
     */
    public String getCardNo(){
        return cardID.toString();
    }
}

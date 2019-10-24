package starbucks;

public class CardID  implements ITouchEventHandler, IDisplayComponent, IKeyPadObserver{
    ITouchEventHandler nextHandler ;
    StringBuilder cardID = new StringBuilder();
    @Override
    public String display() {
        String value = "[" ;
        value += cardID.toString();
        value += "]";
        return value  ;
    }

    @Override
    public void addSubComponent(IDisplayComponent c) {

    }

    @Override
    public void keyEventUpdate(int c, String key) {
        System.err.println( "Key: " + key ) ;
        if( cardID.length() < 9) {
            cardID.append(key);
        }
    }

    @Override
    public void touch(int x, int y) {
        if ( nextHandler != null )
            nextHandler.touch(x,y) ;
    }

    @Override
    public void setNext(ITouchEventHandler next) {
        nextHandler = next ;
    }
}

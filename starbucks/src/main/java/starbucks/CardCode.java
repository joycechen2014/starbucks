package starbucks;

public class CardCode  implements ITouchEventHandler, IDisplayComponent, IKeyPadObserver {
    ITouchEventHandler nextHandler ;
    StringBuilder cardCode = new StringBuilder();
    @Override
    public String display() {
        String value = "[" ;
        value += cardCode.toString();
        value += "]";
        return value  ;
    }

    @Override
    public void addSubComponent(IDisplayComponent c) {

    }

    @Override
    public void keyEventUpdate(int c, String key) {
        System.err.println( "Key: " + key ) ;
        if( cardCode.length() < 3) {
            cardCode.append(key);
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
    public boolean isComplete() {
        return cardCode.length() == 3;
    }

    public String getCardcode(){
        return cardCode.toString();
    }
}

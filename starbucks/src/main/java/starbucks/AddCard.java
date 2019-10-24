
package starbucks;

/**
 * Add New Card Screen
 */
public class AddCard extends Screen implements IScreen
{

    private KeyPad kp;
    private CardID ci;
    private Spacer sp ;
    private CardCode cc;
    public AddCard()
    {
        kp = new KeyPad() ;
        ci = new CardID() ;
        sp = new Spacer() ;
        cc = new CardCode() ;


        // setup the composite pattern
        addSubComponent( ci ) ;
        addSubComponent( cc ) ;
        addSubComponent( sp ) ;
        addSubComponent( kp ) ;


        // setup the observer pattern
        ((IKeyPadSubject)kp).attach( ci ) ;
        //((IKeyPadSubject)kp).attach( this ) ;
        // ((IPinAuthSubject)addCard).registerObserver((IPinAuthObserver) this) ;

    }

    @Override
    public void touch(int x, int y) {
        if(( x == 1 || x == 2 || x == 3 ) && y == 2){
            ((IKeyPadSubject)kp).removeObserver( cc ); ;
            ((IKeyPadSubject)kp).attach( ci ) ;
        }
        else if(x == 2 && y == 3) {
            ((IKeyPadSubject)kp).removeObserver( ci ); ;
            ((IKeyPadSubject)kp).attach( cc ) ;
        }
        kp.touch(x, y);
    }
}

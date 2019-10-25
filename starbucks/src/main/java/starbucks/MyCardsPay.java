

package starbucks;

/** My Card Pay Screen */
public class MyCardsPay extends Screen
{
    private MyCards mycard;
    public MyCardsPay()
    {

    }
    public MyCardsPay(MyCards card) {
        mycard = card;
    }


    @Override
    public String display() {
        String value = mycard.getCardID() != null ? "["+mycard.getCardID()+"]" : "[000000000]";
        value += "\n\n\n";
        value += "Scan Now";
        return value;
    }

    @Override
    public void touch(int x, int y) {
        if((x == 2 || x == 3) && y == 2) {
            if(Double.valueOf(mycard.getValue()) >= 1.5)
            mycard.setValue(Double.toString((Double.valueOf(mycard.getValue()) - 1.5)));
        }
        if( x == 3 && y == 3) {
            Frame.getInstance().setCurrentScreen(mycard);
        }
    }
}


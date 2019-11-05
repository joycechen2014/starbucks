

package starbucks;

import java.text.DecimalFormat;

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

    /**
     * Get Display Contents
     * @return Display Contents
     */
    @Override
    public String display() {
        String value = mycard.getCardID() ;
        value += "\n\n\n";
        value += "Scan Now";
        return value;
    }
    /**
     * Send Touch Events to the Chain
     * @param x Touch X Coord.
     * @param y Touch Y Coord.
     */
    @Override
    public void touch(int x, int y) {
        if((x == 2 || x == 3) && y == 2) {
            DecimalFormat df = new DecimalFormat("0.00");
            if(Double.valueOf(mycard.getValue().substring(1)) >= 1.50)
            mycard.setValue("$"  + df.format(Double.valueOf(mycard.getValue().substring(1)) - 1.50));
        }
        if( x == 3 && y == 3) {
            Frame.getInstance().setCurrentScreen(mycard);
        }
    }
}


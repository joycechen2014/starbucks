

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


    @Override
    public String display() {
        String value = mycard.getCardID() != null ? "[" + mycard.getCardID() + "]" : "[000000000]";
        value += "\n\n\n";
        value += "Scan Now";
        return value;
    }

    @Override
    public void touch(int x, int y) {
        if((x == 2 || x == 3) && y == 2) {
            DecimalFormat df = new DecimalFormat("#.00");
            if(Double.valueOf(mycard.getValue().substring(1)) >= 1.50)
            mycard.setValue("$"  + df.format(Double.valueOf(mycard.getValue().substring(1)) - 1.50));
        }
        if( x == 3 && y == 3) {
            Frame.getInstance().setCurrentScreen(mycard);
        }
    }
}


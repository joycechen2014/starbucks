

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
        String value = "";
        value += mycard.getCardID();
        value += "\n\n";
        value += "Scan Now.";
        return value;
    }
}


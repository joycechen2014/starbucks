

package starbucks ;

/** Payments Screen */
public class Payments extends Screen
{

    public Payments()
    {

    }

    @Override
    public String display() {
        String value = "";
        value += "Find Store\n";
        value += "Enable Payments";
        return value;
    }
}

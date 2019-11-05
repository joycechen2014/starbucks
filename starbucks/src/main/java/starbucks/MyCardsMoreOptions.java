

package starbucks;

/** My Card More Options Screen */
public class MyCardsMoreOptions extends Screen
{
  
    public MyCardsMoreOptions()
    {
    }
    /**
     * Get Display Contents
     * @return Display Contents
     */
    @Override
    public String display() {
        String value = "";
        value += "Refresh\n";
        value += "Reload\n";
        value += "Auto Reload\n";
        value += "Transaction";
        return value;
    }
}

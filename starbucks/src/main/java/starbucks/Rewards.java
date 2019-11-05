

package starbucks ;

/** Rewards Screen */
public class Rewards extends Screen
{

    public Rewards()
    {

    }
    /**
     * Get Display Contents
     * @return Display Contents
     */
    @Override
    public String display() {
        String value = "";
        value += "Make Every\n";
        value += "Visit Count";
        return value;
    }
}

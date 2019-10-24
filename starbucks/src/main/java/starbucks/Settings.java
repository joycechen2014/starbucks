

package starbucks;

/** Settings Screen */
public class Settings extends Screen
{
   
    public Settings()
    {
       
    }

    //@Override
    public void touch(int x, int y) {

    }

    @Override
    public String display() {
        String out = "";
        out += "Add Card\n";
        out += "Delete Card\n";
        out += "Billing\n";
        out += "Passcode\n\n";
        out += "About|Terms\n";
        out += "Help";
       return out;
    }
}

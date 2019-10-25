

package starbucks;

/** My Card Options Screen */
public class MyCardsOptions extends Screen
{
    private MyCardsMoreOptions mycardsmoreoptions;
    public MyCardsOptions()
    {
        mycardsmoreoptions = new MyCardsMoreOptions();
    }

    @Override
    public String display() {
        String value = "";
        value += "Reload\n";
        value += "Refresh\n";
        value += "More Options\n";
        value += "Cancel";
        return value;
    }

    @Override
    public void touch(int x, int y) {
        if( (x == 1 || x == 2 || x == 3) && y == 7) {
            Frame.getInstance().setCurrentScreen(mycardsmoreoptions);
        }
    }
}

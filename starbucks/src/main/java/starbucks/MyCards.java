

package starbucks ;

/** My Cards Screen */
public class MyCards extends Screen
{
    private String value;
    private CardCode cc;
    private CardID ci;
    private MyCardsPay mycardPay = new MyCardsPay();
    private MyCardsOptions mycardoptions = new MyCardsOptions();
    public MyCards() {
        this.value = "$0.00";
        ci = null;
    }
    public MyCards(String s,CardID card_id,CardCode card_code)
    {
      value = s;
      cc = card_code;
      ci = card_id;
    }

    @Override
    public String display() {
       return  value;
    }

    @Override
    public void touch(int x, int y) {
        if( x == 3 && y == 3) {
            MyCards myCards = (MyCards) Frame.getInstance().getCurrentScreen();
            Frame.getInstance().setCurrentScreen(new MyCardsPay(myCards));
        }
        else if( x == 2 && y == 4) {
            Frame.getInstance().setCurrentScreen(mycardoptions);
        }

    }
    public String getCardID() {
        return ci != null ? ci.getCardNo() : null;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

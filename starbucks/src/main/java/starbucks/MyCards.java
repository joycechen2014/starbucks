

package starbucks ;

/** My Cards Screen */
public class MyCards extends Screen
{
    private String value;
    private CardCode cc;
    private CardID ci;
    public MyCards() {
        value = "0.00";
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
            MyCardsPay mycardPay = new MyCardsPay(this);
            Frame.getInstance().setCurrentScreen(mycardPay);
        }
    }
    public String getCardID() {
        return ci.getCardNo();
    }
}

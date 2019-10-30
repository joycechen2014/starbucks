

package starbucks ;

/** Store Screen */
public class Store extends Screen
{
    private int row = 15;
    private int colum = 12;
    char[][] map = new char[row][colum];

    public Store()
    {
      map[10][3] = 'X';
      map[5][5] = 'X';
    }

    @Override
    public  String display() {
        StringBuffer value = new StringBuffer();
        //String value = "";
        for(int i = 0; i < row; i++ ) {
            for (int j = 0; j < colum; j++) {
                value.append(map[i][j]);
            }
            value.append("\n");
        }
        return value.toString();
    }
}

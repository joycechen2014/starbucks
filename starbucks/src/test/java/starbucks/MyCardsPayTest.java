/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package starbucks;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyCardsPayTest
{

    IApp app ;

    public MyCardsPayTest()
    {
    }

    @Before
    public void setUp()
    {
        app = new AppAuthProxy() ;
    }

    @Test
    public void AddCardTest1()
    {
        String[] lines ;
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        app.execute("E") ; // Settings Page
        assertEquals("Settings", app.screen());
        app.touch(1,1) ; // Add New Card
        assertEquals("AddCard", app.screen());
        // Card Id digits
        app.touch(1,5); // 1
        app.touch(2,5); // 2
        app.touch(3,5); // 3
        app.touch(1,6); // 4
        app.touch(2,6); // 5
        app.touch(3,6); // 6
        app.touch(1,7); // 7
        app.touch(2,7); // 8
        app.touch(3,7); // 9
        app.touch(2,3); // focus on card code
        // Card Code digits
        app.touch(3,7); // 9
        app.touch(3,7); // 9
        app.touch(3,7); // 9
        // check digit entry
        app.display() ;
        lines = app.screenContents().split("\n");
        assertEquals("[123456789]", lines[4].trim());
        assertEquals("[999]", lines[5].trim());
        // add card - see balance
        app.next() ;
        app.display() ;
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$20.00", lines[7]);
        // Go to Card Pay
        app.touch(3,3);
        app.display();
        assertEquals("MyCardsPay", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("[123456789]", lines[6]);
        app.touch(2,2);
        app.touch(3,3);
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$18.50", lines[7]);
        app.touch(3,3);
        app.touch(3,2);
        app.touch(3,3);
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$17.00", lines[7]);
        app.touch(3,3);
        app.touch(3,2);
        app.touch(3,3);
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$15.50", lines[7]);
        app.touch(3,3);
        app.touch(3,2);
        app.touch(3,3);
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$14.00", lines[7]);
        app.touch(3,3);
        app.touch(3,2);
        app.touch(3,3);
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$12.50", lines[7]);
        app.touch(3,3);
        app.touch(3,2);
        app.touch(3,3);
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$11.00", lines[7]);
        app.touch(3,3);
        app.touch(3,2);
        app.touch(3,3);
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$9.50", lines[7]);
        app.touch(3,3);
        app.touch(3,2);
        app.touch(3,3);

        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$8.00", lines[7]);
        app.touch(3,3);
        app.touch(3,2);
        app.touch(3,3);

        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$6.50", lines[7]);
        app.touch(3,3);
        app.touch(3,2);
        app.touch(3,3);
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$5.00", lines[7]);
        app.touch(3,3);
        app.touch(3,2);
        app.touch(3,3);
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$3.50", lines[7]);
        app.touch(3,3);
        app.touch(3,2);
        app.touch(3,3);
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$2.00", lines[7]);
        app.touch(3,3);
        app.touch(3,2);
        app.touch(3,3);
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$0.50", lines[7]);
        app.touch(3,3);
        app.touch(3,2); // balance below $1.5
        app.touch(3,3);

        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");
        assertEquals("$0.50", lines[7]);

    }

    @After
    public void tearDown()
    {
    }
}

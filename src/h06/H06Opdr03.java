package h06;

// Opdracht 6.3: Schrijf een applet waarin je twee ints met positieve waarden bij elkaar optelt en er een negatieve int uit komt.

import java.awt.*;
import java.applet.*;

public class H06Opdr03 extends Applet {

    int a;
    int b;
    int c;
    int negative;


    public void init() {
        a = 1;
        b = 2;
        c = a + b;
        negative = -c;

    }
    public void paint(Graphics g){
        g.drawString("answer " + -c, 50, 50 );
    }


}

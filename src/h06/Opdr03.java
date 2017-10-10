package h06;

// Opdracht 6.3: Schrijf een applet waarin je twee ints met positieve waarden bij elkaar optelt en er een negatieve int uit komt.

import java.awt.*;
import java.applet.Applet;

public class Opdr03 extends Applet {

    private int c;


    public void init() {
        int a = 1;
        int b = 2;
        //berekening
        c = -(a + b);

    }
    public void paint(Graphics g){
        g.drawString("uitkomst = " + c, 50, 50 );
    }


}

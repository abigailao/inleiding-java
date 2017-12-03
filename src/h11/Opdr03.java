package h11;

/* Opdracht 11.3: Geef de rij van Fibonacci. De eerste twee getallen van de rij zijn 1 en
 de volgende zijn de som van de twee voorgangers. 1, 1, 2, 3, 5, 8, 13, 21 en zo voort...*/

import java.awt.*;
import java.applet.*;

public class Opdr03 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller1 = 0;
        int teller2 = 1;
        int som;
        int x = 0;

        for (int i = 0; i < 10; i++) {
            x += 20;
            som = teller1 + teller2;
            teller2 = teller1;
            teller1 = som;
            g.drawString("" + som, x, 50);
        }
    }
}

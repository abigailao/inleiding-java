package h11;

// Opdracht 11.2: Schrijf een applet, waarin tien getallen van 20 tot 10 worden getoond.

import java.awt.*;
import java.applet.*;

public class Opdr02 extends Applet{

    public void init(){

    }

    public void paint(Graphics g){
        int teller = 20;
        int x = 0;

        while (teller > 10){
            x += 20;
            g.drawString("" +teller, x,50);
            teller--;
        }
    }
}

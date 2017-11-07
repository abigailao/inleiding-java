package h11;

// Opdracht 11.1: Schrijf een applet, waarin 10 verticale lijnen worden getoond.

import java. awt.*;
import java.applet.Applet;

public class Opdr01 extends Applet{

    public void init() {
setSize(300,200);
    }

    public void paint(Graphics g){

        int teller = 1;
        int x = 0;

        while(teller <= 10){
            x += 20;
            g.drawLine(x,50,x,150);
            teller++;
        }
    }
}

package h02;

// Opdracht 2.1: Maak een applet in Java waarin je naam in het geel wordt afgedrukt op een blauw achtergrond.

import java.awt.*;
import java.applet.*;

public class H02Opdr01 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Abigail", 190,160);
    }


}
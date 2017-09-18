package h02;

// Maak een applet in Java waarin je roepnaam en je achternaam onder elkaar worden afgedrukt.
//De achtergrond kleur is wit, je roepnaam wordt in blauw en je achternaam in rood afgedrukt op het scherm.

import java.awt.*;
import java.applet.*;

public class H02Opdr02 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
            g.setColor(Color.blue);
            g.drawString("Abigail", 190, 160);
        g.setColor(Color.red);
            g.drawString("Akhile Oijiangbe", 190, 175);

        }
    }

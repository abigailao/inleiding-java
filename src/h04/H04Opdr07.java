package h04;

// Opdracht 4.7: Teken de zijde waarop de vier van een dobbelsteen staat

import java.awt.*;
import java.applet.*;

public class H04Opdr07 extends Applet{

    public void init() {
    }
    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.white);
        g.fillRoundRect(20,20,100,100,10,10);
        g.setColor(Color.black);
        g.fillOval(30,30,20,20);
        g.fillOval(30,90,20,20);
        g.fillOval(90,30,20,20);
        g.fillOval(90,90,20,20);
    }

}

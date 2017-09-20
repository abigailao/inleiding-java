package h04;

// Opdracht 6.6: Teken een stoplicht

import java.awt.*;
import java.applet.*;

public class H04Opdr06 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(100,35,15,260);
        g.setColor(Color.black);
        g.fillRoundRect(83,30,50,90,20,20);
        g.setColor(Color.red);
        g.fillOval(99,40,20,20);
        g.setColor(Color.orange);
        g.fillOval(99,65,20,20);
        g.setColor(Color.green);
        g.fillOval(99,90,20,20);
        g.setColor(Color.white);
        g.fillRect(100,120,15,10);
        g.setColor(Color.darkGray);
        g.drawRect(100,120,14,10);
        g.setColor(Color.white);
        g.fillRect(100,140,15,10);
        g.setColor(Color.darkGray);
        g.drawRect(100,140,14,10);
        g.setColor(Color.white);
        g.fillRect(100,160,15,10);
        g.setColor(Color.darkGray);
        g.drawRect(100,160,14,10);
        g.setColor(Color.white);
        g.fillRect(100,180,15,10);
        g.setColor(Color.darkGray);
        g.drawRect(100,180,14,10);
        g.setColor(Color.white);
        g.fillRect(100,200,15,10);
        g.setColor(Color.darkGray);
        g.drawRect(100,200,14,10);
        g.setColor(Color.white);
        g.fillRect(100,220,15,10);
        g.setColor(Color.darkGray);
        g.drawRect(100,220,14,10);

    }
}

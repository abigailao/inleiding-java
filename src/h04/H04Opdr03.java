package h04;

// Opdracht 4.3: Teken de Nederlandse vlag aan een vlaggenstok

import java.awt.*;
import java.applet.*;

public class H04Opdr03 extends Applet{

    public void init() {
    }
    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.darkGray);
        g.fillRect(85,35,5,150);
        g.setColor(Color.RED);
        g.fillRect(90,35,70,10);
        g.setColor(Color.WHITE);
        g.fillRect (90,45,70,10);
        g.setColor(Color.BLUE);
        g.fillRect(90,55,70,10);
        g.setColor(Color.orange);
        g.fillRoundRect(84,30,8,8,15,5);

    }

}

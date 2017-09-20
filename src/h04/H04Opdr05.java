package h04;

// Opdracht 4.5: Teken met fillArc() op een blauwe achtergrond een ellips die met geel is gevuld.

import java.awt.*;
import java.applet.*;

public class H04Opdr05 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillOval(130, 20, 100, 50);
    }


}
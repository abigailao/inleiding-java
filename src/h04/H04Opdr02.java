package h04;

// Opdracht 4.2: Teken een huis met daarin tenminste één raam en een deur

import java.awt.*;
import java.applet.*;

public class H04Opdr02 extends Applet{

    public void init() {
    }
    public void paint(Graphics g) {
        g.drawRect(160,160,160,100);
        g.drawRect(260, 210,30,50 );
        g.drawRect(180, 210, 60, 20);
        g.drawPolygon(new int[] {160,240,320}, new int[] {160,100,160}, 3);
        g.drawOval(262,235,5,5);

    }

}

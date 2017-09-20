package h04;

// Opdracht 4.1: Teken een gelijkbenige driehoek

import java.awt.*;
import java.applet.*;

public class H04Opdr01 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        g.drawPolygon(new int[] {180, 200, 220},new int[] {160, 40, 160}, 3);
    }

}

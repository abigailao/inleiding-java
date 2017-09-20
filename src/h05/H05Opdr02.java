package h05;

/* Opdracht 5.2: Maak opgave 4.4 (staafdiagram) nu opnieuw,
maar nu zodanig dat als je het gewicht van de kinderen verandert de staven automatisch worden aangepast als je de Applet uitvoert.
 */

import java.awt.*;
import java.applet.*;

public class H05Opdr02 extends Applet{

Color gray;
Color gray2;
Color gray3;
int width;

    public void init() {
        gray = Color.LIGHT_GRAY;
        gray2 = Color.GRAY;
        gray3 = Color.darkGray;
    }
    public void paint(Graphics g) {
        g.fillRect(50,0,1,270);
        g.fillRect(50,270,270,1);
        g.drawString("Valerie", 80, 285);
        g.drawString("Jeroen", 160, 285);
        g.drawString("Hans", 240, 285);
        g.drawString("0",42,280);
        g.drawString("20", 33, 250);
        g.drawString("40", 33,220);
        g.drawString("60",33,190);
        g.drawString("80",33,160);
        g.drawString("100",26,130);
        g.drawString("120",26,100);
        g.drawString("140",26,70);
        g.drawString("160",26,40);
        g.drawString("180",26,10);
        g.setColor(gray);
        g.fillRect(75,220,50,50);
        g.setColor(gray2);
        g.fillRect(150,130,50,140);
        g.setColor(gray3);
        g.fillRect(230,160,50,110);
    }


}

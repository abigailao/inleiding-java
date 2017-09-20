package h04;

/* Drie kinderen hebben het volgende gewicht:
 Valerie: 40 kg, Jeroen: 100 kg, Hans: 80 kg
 Maak van deze gegevens een staafdiagram, waarbij elke kolom een eigen kleur heeft. De namen van de kinderen staan onder het staafdiagram en de verdeling van de schaal staat naast de diagram met daarbij om de 20 de verdeling.
*/

import java.awt.*;
import java.applet.*;

public class H04Opdr04 extends Applet{

    public void init() {
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
        g.setColor(Color.lightGray);
        g.fillRect(75,220,50,50);
        g.setColor(Color.gray);
        g.fillRect(150,130,50,140);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(230,160,50,110);
    }


}

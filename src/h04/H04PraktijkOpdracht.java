package h04;

/* Praktijk Opdracht Hoofdstuk 4: Schrijf een applet in Java, waarin de bovenstaande figuur wordt getekend.
De kleur van de gevulde figuren is magenta en de teksten zijn in het zwart. De afgeronde hoeken hebben de waarde 30 en de taartpunt begint bij 0 en de hoek is 45 graden.
 */

import java.awt.*;
import java.applet.*;

public class H04PraktijkOpdracht extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        g.drawLine(10,10,200,10);
        g.drawString("Lijn",90,25);
        g.drawRect(10,40,190,100);
        g.drawString("Rechthoek",70,155);
        g.drawRoundRect(10,170,190,100,30,30);
        g.drawString("Afgeronde rechthoek",45,285);
        g.setColor(Color.magenta);
        g.fillRect(220,40,190,100);
        g.setColor(Color.black);
        g.drawOval(220,40,190,100);
        g.drawString("Gevulde rechthoek met ovaal",235,155);
        g.setColor(Color.magenta);
        g.fillOval(220,170,190,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 275,285);
        g.drawOval(430,40,190,100);
        g.setColor(Color.magenta);
        g.fillArc(430, 40, 190, 100, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 445,155);
        g.setColor(Color.black);
        g.drawOval(470,170,100,100);
        g.drawString("Cirkel", 505,285);


    }


}

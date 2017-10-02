
package h06;

import java.applet.Applet;
import java.awt.*;

public class H01 extends Applet{

/**Opdracht 6.1: Met z'n vieren (Jan, Ali, Jeannette en jij) hebben jullie een karwei verricht en daarmee 113 euro verdiend.
Schrijf een applet waarin je een berekening maakt om het geld zo eerlijk mogelijk te verdelen.
In het venster van de applet komen de vier namen onder elkaar te staan met daarachter het bedrag dat een ieder krijgt.
 */

private double uitkomst;

    public void init() {
         double getal = 113;
         double getal2 = 4;
         uitkomst = getal / getal2;

    }

    //namen onder elkaar met verdeelde bedragen erachter.
    public void paint(Graphics g) {
        g.drawString("Jan " + uitkomst, 50,50);
        g.drawString("Ali " + uitkomst, 50,70);
        g.drawString("Jeannette " + uitkomst, 50, 90);
        g.drawString("Abigail " + uitkomst, 50, 110);
    }

}
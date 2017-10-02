
package h06;

import java.applet.Applet;
import java.awt.*;

public class H01 extends Applet{

/*Opdracht 6.1: Met z'n vieren (Jan, Ali, Jeannette en jij) hebben jullie een karwei verricht en daarmee 113 euro verdiend.
Schrijf een applet waarin je een berekening maakt om het geld zo eerlijk mogelijk te verdelen.
In het venster van de applet komen de vier namen onder elkaar te staan met daarachter het bedrag dat een ieder krijgt.
 */

    int x;
    String Jan;
    String Ali;
    String Jeannette;
    String Abigail;

    public void init() {
       x = 113 / 4;
       Jan = "Jan ";
       Ali = "Ali ";
       Jeannette = "Jeannette ";
       Abigail = "Abigail ";
    }

    //namen onder elkaar met verdeelde bedragen erachter.
    public void paint(Graphics g) {
        g.drawString("Jan " +  x, 50,50);
        g.drawString("Ali " + x, 50,70);
        g.drawString("Jeannette " + x, 50, 90);
        g.drawString("Abigail " + x, 50, 110);
    }

}
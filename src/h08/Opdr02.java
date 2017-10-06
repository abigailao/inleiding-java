package h08;

/* Op de open avonden van school wordt bijgehouden hoeveel mannen en vrouwen en
hoeveel potentiële vrouwelijke en mannelijke leerlingen de school op zo'n avond bezoeken.
Schrijf een applet waarin alleen op één van de vier knoppen geklikt hoeft te worden en de vier aantallen en
het totaal wordt in het venster van de applet worden bijgehouden.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr02 extends Applet {
    Button knopm, knoppman, knopv, knoppvrouw;
    int m1, m2, v1, v2;
    
    public void init() {
        knopm = new Button("aantal mannen");
        knopm.addActionListener(new Knop1listener());
        add(knopm);

        knopv = new Button("aantal vrouwen");
        knopv.addActionListener(new Knop2listener());
        add (knopv);

        knoppman = new Button("aantal poteniële mannen");
        knoppman.addActionListener(new Knop3listener());
        add (knoppman);

        knoppvrouw = new Button("aantal potentiële vrouwen");
        knoppvrouw.addActionListener(new Knop4listener());
        add (knoppvrouw);
    }


    public void paint(Graphics g) {
        g.drawString("aantal mannen: " + m1, 25, 150);
        g.drawString("aantal vrouwen: " + v1, 25, 175);
        g.drawString("aantal potentiele mannen: " +m2, 25, 200);
        g.drawString("aantal pontentiele vrouwen: " + v2, 25, 225);
    }

    class Knop1listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m1++;
            repaint();
        }
    }

    class Knop2listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            v1++;
            repaint();
        }
    }

    class Knop3listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m2++;
            repaint();
        }
    }

    class Knop4listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            v2++;
            repaint();
                }
            }
}
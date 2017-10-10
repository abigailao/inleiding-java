package h08;

/* Maak een applet waarin een tekstvak met label en een knop Ok staan.
In het tekstvak moet een bedrag worden ingevuld en
zodra de gebruiker op Ok klikt of op de enter-toets drukt
moet de prijs inclusief BTW (= 21%) in het venster geplaatst worden. */

import java.awt.*;
import java.applet.*;
import java.applet.Applet.*;
import java.awt.event.*;

public class Opdr03 extends Applet {
    TextField tekstvak;
    Button knop;
    double getal;

    public void init() {
        tekstvak = new TextField("Type een bedrag", 20);
        tekstvak.addActionListener( new knopListener());
        add(tekstvak);

        knop = new Button ("Ok");
        knop.addActionListener(new knopListener());
        add(knop);


    }

    public void paint(Graphics g) {
        g.drawString("Bedrag + BTW: " + getal, 50, 60);
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = Double.parseDouble(tekstvak.getText());
            getal = getal *1.21;
            repaint();
        }
    }
}
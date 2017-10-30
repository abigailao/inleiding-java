package h10;

// Voorbeeld 10.1

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;


public class PraktijkOpdracht extends Applet {
    Label label;
    TextField tekstvak;
    String s, tekst;
    int cijfer, newcijfer;

    public void init() {
        label = new Label("Voer uw cijfer in: ");

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        s = "";

        newcijfer = 0;
        cijfer = 0;

        add(tekstvak);
        add (label);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = 0;
            newcijfer = 0;
            cijfer = Integer.parseInt(s);{
                if (cijfer <= 3) {
                    tekst = "slecht";
                } else if (cijfer == 4) {
                    tekst = "onvoldoende";
                } if (cijfer == 5) {
                    tekst = "matig";
                } else if (cijfer == 6 || cijfer == 7) {
                    tekst = "voldoende";
                } if (cijfer >= 8 && cijfer <= 10) {
                    tekst = "goed";
                } else if (cijfer > 10) {
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                }
                repaint();
            }
        }
    }

}
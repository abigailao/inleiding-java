package h10;

/*Schrijf een applet in Java waarin een cijfer ingevoerd wordt en
in het venster van de applet wordt getoond of het cijfer slecht, onvoldoende, matig, voldoende of goed is.
Als er een cijfer wordt ingevoerd dat niet in de onderstaande rij voorkomt,
dan moet er een waarschuwing getoond worden dat er een verkeerd cijfer is ingevoerd.
De cijfers 1, 2 en 3 zijn slecht, het cijfer 4 is onvoldoende, het cijfer 5 is matig, de cijfers 6 en 7 zijn voldoende,
de cijfers 8, 9 en 10 zijn goed.*/

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;


public class PraktijkOpdracht extends Applet {
    Label Label;
    TextField Tekstvak;
    String S, Tekst;
    int Cijfer;

    public void init() {
        Label = new Label("Voer uw cijfer in: ");

        Tekstvak = new TextField("", 20);
        Tekstvak.addActionListener( new TekstvakListener() );
        Tekst = "";
        S = "";

        Cijfer = 0;

        add(Tekstvak);
        add (Label);

    }

    public void paint(Graphics g) {
        g.drawString(Tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = Tekstvak.getText();
            Cijfer = 0;
            Cijfer = Integer.parseInt(S);{
                if (Cijfer <= 3) {
                    Tekst = "slecht";
                } else if (Cijfer == 4) {
                    Tekst = "onvoldoende";
                } if (Cijfer == 5) {
                    Tekst = "matig";
                } else if (Cijfer == 6 || Cijfer == 7) {
                    Tekst = "voldoende";
                } if (Cijfer >= 8 && Cijfer <= 10) {
                    Tekst = "goed";
                } else if (Cijfer > 10) {
                    Tekst = "U hebt een verkeerd nummer ingetikt ..!";
                }
                repaint();
            }
        }
    }

}
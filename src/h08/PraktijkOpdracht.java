package h08;

/*Maak een rekenmachine in een applet. De rekenmachine bestaat uit twee tekstvakken en
 vier knoppen. De gebruiker tikt in het eerste tekstvak een getal in en in het tweede
 en klikt vervolgens op één van de knoppen om de berekening te laten uitvoeren.
 De uitkomst wordt in het eerste tekstvak getoond en
 het tweede tekstvak wordt leeggemaakt.*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    TextField tekstvak1, tekstvak2;
    Button keer, delen, plus, min;
    double getal1, getal2, antwoord1, antwoord2, antwoord3, antwoord4;


    public void init() {
        //Grootte applet
        setSize(450,170);


        //Tekstvak cijfers
        tekstvak1 = new TextField("", 15);
        add(tekstvak1);

        tekstvak2 = new TextField("", 15);
        add(tekstvak2);


        //knopen: keer,delen,plus en min
        keer = new Button("*");
        keer.addActionListener(new keerListener());
        add(keer);


        delen = new Button("/");
        delen.addActionListener(new delenListener());
        add(delen);

        plus = new Button("+");
        plus.addActionListener(new plusListener());
        add(plus);

        min = new Button ("-");
        min.addActionListener((new minListener()));
        add(min);
    }


    public void paint(Graphics g) {

    }

    //uitkomst en berekening som.
    class keerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(tekstvak1.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());
//(selfnote: Berekening niet bij init. Eerst ontstaat de applet daarna komt de som.)
            antwoord1 = getal1 * getal2;
            tekstvak1.setText("" + antwoord1);
            tekstvak2.setText("");
            repaint();
        }
    }

    class delenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(tekstvak1.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());
            antwoord2 = getal1 / getal2;
            tekstvak1.setText("" + antwoord2);
            tekstvak2.setText("");
            repaint();
        }
    }

    class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(tekstvak1.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());
            antwoord3 = getal1 + getal2;
            tekstvak1.setText("" + antwoord3);
            tekstvak2.setText("");
            repaint();
        }
    }

    class minListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(tekstvak1.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());
            antwoord4 = getal1 - getal2;
            tekstvak1.setText("" + antwoord4);
            tekstvak2.setText("");
            repaint();
        }
    }
}
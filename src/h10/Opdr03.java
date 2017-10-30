package h10;

//Schrijf een applet, waarin het maandnummer ingetikt wordt en de maandnaam en het aantal dagen wordt getoond.

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr03 extends Applet {
    TextField Tekstvak;
    Label Label;
    String S, Tekst;
    int Dag;

    public void init() {
        Tekstvak = new TextField("", 20);
        Label = new Label("Type het maand nummer en druk op enter");
        Tekstvak.addActionListener( new tekstvakListener());
        Tekst = "";
        add(Label);
        add(Tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(Tekst, 80, 70 );
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = Tekstvak.getText();
            Dag = Integer.parseInt( S);
            switch(Dag) {
                case 1:
                    Tekst = "Januari: 31 dagen";
                    break;
                case 2:
                    Tekst = "Februari: 28 dagen";
                    break;
                case 3:
                    Tekst = "Maart: 31 dagen";
                    break;
                case 4:
                    Tekst = "April: 30 dagen";
                    break;
                case 5:
                    Tekst = "Mei: 31 dagen";
                    break;
                case 6:
                    Tekst = "Juni: 30 dagen";
                    break;
                case 7:
                    Tekst = "Juli: 31 dagen";
                    break;
                case 8:
                    Tekst = "Augustus: 31 dagen";
                    break;
                case 9:
                    Tekst = "September: 30 dagen";
                    break;
                case 10:
                    Tekst = "Oktober: 31 dagen";
                    break;
                case 11:
                    Tekst = "November: 30 dagen";
                    break;
                case 12:
                    Tekst = "December: 31 dagen";
                    break;
                default:
                    Tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}
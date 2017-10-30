package h10;

/*Breid de applet zo uit, dat ook het jaar ingegeven kan worden en
 aan de hand daarvan wordt bepaald of het om een schrikkeljaar gaat
 om het juiste aantal dagen voor februari te kunnen vaststellen.*/

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr04 extends Applet {
    TextField Maand, Jaar;
    Label Label1;
    String A,S, Maand2, Jaar2;
    int Dag, Jaartal;

    public void init() {
        setSize(500,150);

        Maand = new TextField("", 10);
        Maand.addActionListener( new datumListener());
        add(Maand);

        Jaar = new TextField("",10);
        Jaar.addActionListener(new datumListener());
        add(Jaar);

        //tekst
        Label1 = new Label("Type eerst de maand en dan het jaar nummer in. Druk nu op enter");
        add(Label1);

        //uitkomst
        Maand2 = "";
        Jaar2 = "";
    }

    
    public void paint(Graphics g) {
        g.drawString(Maand2 + Jaar2, 80, 80 );
    }

    class datumListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            A = Maand.getText();
            S = Jaar.getText();
            //ophaal
            Jaartal = Integer.parseInt(S);
            Dag = Integer.parseInt( A);
            //maand berekening
            switch(Dag) {
                case 1:
                    Maand2 = "Januari: 31 dagen, ";
                    break;
                case 2:
                    if ((Jaartal % 4 == 0 && !(Jaartal % 100 == 0)) ||
                            Jaartal % 400 == 0 ) {
                        Maand2 = "Februari: 29 dagen, ";
                    }
                    else {
                        Maand2 = "Februari: 28 dagen, ";
                        }
                        break;
                case 3:
                    Maand2 = "Maart: 31 dagen, ";
                    break;
                case 4:
                    Maand2 = "April: 30 dagen, ";
                    break;
                case 5:
                    Maand2 = "Mei: 31 dagen, ";
                    break;
                case 6:
                    Maand2 = "Juni: 30 dagen, ";
                    break;
                case 7:
                    Maand2 = "Juli: 31 dagen, ";
                    break;
                case 8:
                    Maand2 = "Augustus: 31 dagen, ";
                    break;
                case 9:
                    Maand2 = "September: 30 dagen, ";
                    break;
                case 10:
                    Maand2 = "Oktober: 31 dagen, ";
                    break;
                case 11:
                    Maand2 = "November: 30 dagen, ";
                    break;
                case 12:
                    Maand2 = "December: 31 dagen, ";
                    break;
                default:
                    Maand2 = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            // jaar berekening
            if ( (Jaartal % 4 == 0 && !(Jaartal % 100 == 0)) ||
                    Jaartal % 400 == 0 ) {
                Jaar2 = ""+ Jaartal + " Jaar: is een schrikkeljaar";
            }
            else {
                Jaar2 = ""+ Jaartal + " Jaar: is geen schrikkeljaar";
            }
            repaint();
        }
    }
}
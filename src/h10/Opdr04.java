package h10;

/*Breid de applet zo uit, dat ook het jaar ingegeven kan worden en
 aan de hand daarvan wordt bepaald of het om een schrikkeljaar gaat
 om het juiste aantal dagen voor februari te kunnen vaststellen.*/

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr04 extends Applet {
    TextField maand, jaar;
    Label label1;
    String a,s, maand2, jaar2;
    int dag, jaartal;

    public void init() {
        setSize(500,150);

        maand = new TextField("", 10);
        maand.addActionListener( new datumListener());
        add(maand);

        jaar = new TextField("",10);
        jaar.addActionListener(new datumListener());
        add(jaar);

        //tekst
        label1 = new Label("Type eerst de maand en dan het jaar nummer in. Druk nu op enter");
        add(label1);

        //uitkomst
        maand2 = "";
        jaar2 = "";

    }

    public void paint(Graphics g) {
        g.drawString(maand2 + jaar2, 80, 80 );
    }

    class datumListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = maand.getText();
            s = jaar.getText();
            //ophaal
            jaartal = Integer.parseInt(s);
            dag = Integer.parseInt( a);
            //maand berekening
            switch(dag) {
                case 1:
                    maand2 = "Januari: 31 dagen, ";
                    break;
                case 2:
                    if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0 ) {
                        maand2 = "Februari: 29 dagen, ";
                    }
                    else {
                        maand2 = "Februari: 28 dagen, ";
                        }
                        break;
                case 3:
                    maand2 = "Maart: 31 dagen, ";
                    break;
                case 4:
                    maand2 = "April: 30 dagen, ";
                    break;
                case 5:
                    maand2 = "Mei: 31 dagen, ";
                    break;
                case 6:
                    maand2 = "Juni: 30 dagen, ";
                    break;
                case 7:
                    maand2 = "Juli: 31 dagen, ";
                    break;
                case 8:
                    maand2 = "Augustus: 31 dagen, ";
                    break;
                case 9:
                    maand2 = "September: 30 dagen, ";
                    break;
                case 10:
                    maand2 = "Oktober: 31 dagen, ";
                    break;
                case 11:
                    maand2 = "November: 30 dagen, ";
                    break;
                case 12:
                    maand2 = "December: 31 dagen, ";
                    break;
                default:
                    maand2 = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            // jaar berekening
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                jaar2 = ""+ jaartal + " Jaar: is een schrikkeljaar";
            }
            else {
                jaar2 = ""+ jaartal + " Jaar: is geen schrikkeljaar";
            }
            repaint();
        }
    }
}
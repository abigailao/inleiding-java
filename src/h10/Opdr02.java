package h10;

//Breid de applet uit opdracht 1 zo uit dat ook het laagste getal bijgehouden wordt.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdr02 extends Applet {
    TextField Tekstvak;
    double Getal1, Getal2, Getal3;


    public void init() {
        setSize(400,100);

        Tekstvak = new TextField("",10);
        add(Tekstvak);
        Tekstvak.addActionListener(new aListener());

    }

    public void paint(Graphics g) {
        g.drawString("Vul getal in:", 90,20);
        g.drawString("Hoogste getal tot nu toe: " + Getal1, 90, 50);
        g.drawString("Laagste getal tot nu toe: " + Getal3, 90,70);

    }

    class aListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Getal2 = Double.parseDouble(Tekstvak.getText());
            if (Getal3 == 0)
            {
                Getal3 = Getal2;
            }
            if ((Getal2 > Getal1)) {
                Getal1 = Getal2;
                Tekstvak.setText(null);
                repaint();
            }
            if ((Getal2 < Getal1) && (Getal2 < Getal3)) {
                Getal3 = Getal2;
                Tekstvak.setText(null);
                repaint();
            }
        }
    }
}

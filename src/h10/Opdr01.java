package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdr01 extends Applet {
    TextField Tekstvak;
    double Getal1, Getal2;
    String S;


    public void init() {
        setSize(400,100);

        Tekstvak = new TextField("",10);
        add(Tekstvak);
        Tekstvak.addActionListener(new aListener());

        S = "";
    }

    public void paint(Graphics g) {
        g.drawString("Vul getal in:", 90,20);
        g.drawString("Hoogste getal tot nu toe: " + Getal1, 90, 40);

    }

    class aListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Getal2 = Double.parseDouble(Tekstvak.getText());
            if ((Getal2 > Getal1)) {
                Getal1 = Getal2;
                Tekstvak.setText(null);
                repaint();
            }
        }
    }
}

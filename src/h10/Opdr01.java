package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdr01 extends Applet {
    TextField tekstvak;
    double getal1, getal2;
    String s;


    public void init() {
        setSize(400,100);

        tekstvak = new TextField("",10);
        add(tekstvak);
        tekstvak.addActionListener(new aListener());

        s = "";
    }

    public void paint(Graphics g) {
        g.drawString("Vul getal in:", 90,20);
        g.drawString("Hoogste getal tot nu toe: " + getal1, 90, 40);

    }

    class aListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal2 = Double.parseDouble(tekstvak.getText());
            if ((getal2 > getal1)) {
                getal1 = getal2;
                tekstvak.setText(null);
                repaint();
            }
        }
    }
}

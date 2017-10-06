package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr01 extends Applet{
    Button knop1, knop2;
    TextField tekstvak;
    String s;

    public void init() {
        tekstvak = new TextField("vul in",20);
        add(tekstvak);
        s = "";
        knop1 = new Button("Ok");
        add(knop1);
        knop1.addActionListener(new Knop1listener());
        knop2 = new Button("Reset");
        add(knop2);
        knop2.addActionListener(new Knop2listener());

    }

    public void paint(Graphics g){
        g.drawString(s, 50,50);
    }

    class Knop1listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();

        }
    }

    class Knop2listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
        }
    }

}

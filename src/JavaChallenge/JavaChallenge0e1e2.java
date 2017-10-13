package JavaChallenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class JavaChallenge0e1e2 extends Applet {
    TextField tekstvak1, tekstvak2, tekstvak3;
    Button knop1, knop2;
    int width, kg100m, kg100p, nulpunt, Valerie2, Jeroen2, Hans2, Valerie, Jeroen, Hans;
    String s;
    String vak1;

    public void init() {

        setSize(500,300);

        vak1 = "Valerie";
        tekstvak1 = new TextField("",5);
        add(tekstvak1);



        tekstvak2 = new TextField("",5);
        add(tekstvak2);

        tekstvak3 = new TextField("",5);
        add(tekstvak3);


        s = "";
        knop1 = new Button("Toon");
        add(knop1);
        knop1.addActionListener(new Knop1listener());

        width = 50;
        kg100m = 30;
        kg100p = 23;
        nulpunt = 280;

        Valerie = 40;
        Jeroen = 100;
        Hans = 80;
        Valerie2 = nulpunt - Valerie;
        Jeroen2 = nulpunt - Jeroen;
        Hans2 = nulpunt - Hans;
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 50);
//        g.drawString("Valerie", 90, 20);
//        g.drawString("Jeroen", 180, 20);
//        g.drawString("Hans", 270, 20);

        // x- en y- as
        g.drawLine(50, 280, 50, 30);
        g.drawLine(450, 280, 50, 280);

        // namen onder staafdiagrammen
        g.setColor(Color.black);
        g.drawString("Valerie", 105, 295);
        g.drawString("Jeroen", 205, 295);
        g.drawString("Hans", 310, 295);

        //staafdiagrammen
        g.setColor(Color.red);
        g.fillRect(100, Valerie2, width, Valerie);
        g.fillRect(200, Jeroen2, width, Jeroen);
        g.fillRect(300, Hans2, width, Hans);

        g.setColor(Color.black);

        //streepjes naast kg gewichten
        g.drawLine(55, 245, 50, 245);
        g.drawLine(55, 210, 50, 210);
        g.drawLine(55, 175, 50, 175);
        g.drawLine(55, 105, 50, 105);
        g.drawLine(55, 70, 50, 70);

        //kg gewichten
        g.drawString("20", kg100m, 245);
        g.drawString("40", kg100m, 210);
        g.drawString("60", kg100m, 175);
        g.drawString("80", kg100m, 140);
        g.drawString("100", kg100p, 105);
        g.drawString("120", kg100p, 70);
    }
        class Knop1listener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak1.getText();
                repaint();
            }
        }

    }
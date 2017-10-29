package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class Opdr05 extends Applet{
    double gem1, gem2, newgetal, getal;
    Button knop1, knop2;
    TextField vak1;



    public void init() {
        setSize(400,200);

        vak1 = new TextField("",10);
        knop1 = new Button("Voeg een cijfer toe.");
        knop2 = new Button("reset");

        gem1 = 0;
        newgetal = 0;
        getal = 0;

        knop1.addActionListener(new Listen1());
        knop2.addActionListener(new Listen2());

        add(vak1);
        add(knop1);
        add(knop2);
    }


    public void paint(Graphics g) {
        g.drawString("uw gemiddelde is: " + (String.format ("%.2f", Double.valueOf(gem2))), 100, 150);

        if(gem1<0.01)
        {
            g.drawString("",100,100); }


        else if(gem2<5.5)
        {
            g.drawString("U bent gezakt.",100,100); }


        if(gem2>10.1)
        {
            g.drawString("Voer correcte cijfers in.",100,200); }


        else if(gem2>5.45 && gem2<10.1)
        {
            g.drawString("U bent geslaagd.",100,100); }
    }


    class Listen1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            newgetal = Double.parseDouble(vak1.getText());
            gem1++;
            getal = getal + newgetal;
            gem2 = getal/gem1;

            repaint();
        }
    }

    class Listen2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            newgetal = 0;
            gem1 = 0;
            gem2 = 0;
            getal = 0;
            repaint();
        }
    }

}
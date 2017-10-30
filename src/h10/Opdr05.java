package h10;

/*Schrijf een applet,
waarin de gebruiker zijn cijfers kan invoeren en wordt getoond of het cijfer voldoende of onvoldoende is.
Tevens wordt het gemiddelde bijgehouden.
Zodra de gebruiker op de Ok-knop klikt, wordt getoond wat het gemiddelde is en of de leerling geslaagd is.*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class Opdr05 extends Applet{
    double Gem1, Gem2, Newgetal, Getal;
    Button Knop1, Knop2;
    TextField Vak1;



    public void init() {
        setSize(400,200);

        Vak1 = new TextField("",10);
        Knop1 = new Button("Voeg een cijfer toe.");
        Knop2 = new Button("reset");

        Gem1 = 0;
        Newgetal = 0;
        Getal = 0;

        Knop1.addActionListener(new Listen1());
        Knop2.addActionListener(new Listen2());

        add(Vak1);
        add(Knop1);
        add(Knop2);
    }


    public void paint(Graphics g) {
        g.drawString("uw gemiddelde is: " + (String.format ("%.2f", Double.valueOf(Gem2))), 100, 150);

        if(Gem1<0.01)
        {
            g.drawString("",100,100); }


        else if(Gem2<5.5)
        {
            g.drawString("U bent gezakt.",100,100); }


        if(Gem2>10.1)
        {
            g.drawString("Voer correcte cijfers in.",100,200); }


        else if(Gem2>5.45 && Gem2<10.1)
        {
            g.drawString("U bent geslaagd.",100,100); }
    }


    class Listen1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Newgetal = Double.parseDouble(Vak1.getText());
            Gem1++;
            Getal = Getal + Newgetal;
            Gem2 = Getal/Gem1;

            repaint();
        }
    }

    class Listen2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Newgetal = 0;
            Gem1 = 0;
            Gem2 = 0;
            Getal = 0;
            repaint();
        }
    }

}
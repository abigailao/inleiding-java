package h05;

//Opdracht 5.1: Maak praktijkopdracht van Hoofdstuk 4 opnieuw, maar maak nu gebruik van de volgende variabelen; Kleur, breedte en hoogte.

import java.awt.*;
import java.applet.*;

public class H05Opdr01 extends Applet{

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    // Extra Types
    String test;
    String test2;
    String test3;
    String test4;
    String test5;
    String test6;
    String test7;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 190;
        hoogte = 100;
        // Extra Variabelen
        test = "Lijn";
        test2 = "Rechthoek";
        test3 = "Afgeronde rechthoek";
        test4 = "Gevulde rechthoek met ovaal";
        test5 = "Gevulde ovaal";
        test6 = "Taartpunt met ovaal eromheen";
        test7 = "Cirkel";
    }

    public void paint(Graphics g) {
        // Het voordeel van deze aanpak is meer overzicht en maakt het makkelijker om de waardes van de variabelen te wijzigen.
        g.drawLine(10,10,200,10);
        g.drawString(test,90,25);
        g.drawRect(10,40,breedte,hoogte);
        g.drawString(test2,70,155);
        g.drawRoundRect(10,170,breedte,hoogte,30,30);
        g.drawString(test3,45,285);
        g.setColor(opvulkleur);
        g.fillRect(220,40,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(220,40,breedte,hoogte);
        g.drawString(test4,235,155);
        g.setColor(opvulkleur);
        g.fillOval(220,170,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString(test5, 275,285);
        g.drawOval(430,40,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(430, 40, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawString(test6, 445,155);
        g.drawOval(470,170,100,100);
        g.drawString(test7, 505,285);


    }


}

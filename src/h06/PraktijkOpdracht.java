package h06;

/* Een cursist heeft drie cijfers behaald: 5,9; 6.3; 6,9.
Schrijf een applet in Java, waarin van de bovenstaande cijfers het gemiddelde wordt uitgerekend en dat gemiddelde met één decimaal op het scherm wordt getoond.
Op het scherm komt te staan: Het gemiddelde is: 6.3. Het gemiddelde mag afgekapt worden en hoeft niet afgerond te worden.
Als je klaar bent, lever je de broncode in bij je docent.
Aanwijzing: Als je het gemiddelde hebt uitgerekend, komt er te staan 6.366666666... Door gebruik te maken van de eigenschappen van double en int kun je afkappen.
Je moet het gemiddelde met 10 vermenigvuldigen en daarna converteren naar een int. Vervolgens terugconverteren naar een double en door 10 delen. */

import java.awt.*;
import java.applet.Applet;

public class PraktijkOpdracht extends Applet{

    private double uitkomst;

    public void init(){
        double a = 5.9;
        double b = 6.3;
        double c = 6.9;

        // gemiddelde berekend
        uitkomst = (a + b + c)/3;

        // Eerst het gemiddelde * 10 om afronding van het eerste getal achter de komma te voorkomen.
        // Daarna de primitieve type veranderen naar int om decimalen te verwijderen.
        uitkomst = (int) (uitkomst * 10);

        // Het antwoord delen door 10 om een getal achter de komma te krijgen.
        uitkomst = uitkomst / 10;

    }
    public void paint(Graphics g){
        //Uitkomst
        g.drawString("average = " + uitkomst, 50, 50);

    }




}

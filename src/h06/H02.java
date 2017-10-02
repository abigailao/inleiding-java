package h06;

/* Opdracht 6.2: Schrijf een applet, waarin berekend wordt hoeveel seconden er in een uur,
dag en jaar gaan en de uitkomst van de berekening in het venster van de applet toont.
 */

import java.awt.*;
import java.applet.*;

public class H02 extends Applet {

// seconden, een uur, een dag en een jaar.
private int uur;
private int dag;
private int jaar;

public void init(){
    // een minuut heeft 60 seconden.
    int seconden = 60;
    // een uur heeft 60 minuten: 60 seconden * 60 minuten
    uur = seconden * 60;
    // een dag heeft 24 uur: 60 minuten * 24 uren
    dag = uur * 24;
    // een jaar heeft 365 dagen: 24 uren * 365 dagen (m.u.v. het schrikkeljaar)
    jaar = dag * 365; {
    }
}
public void paint(Graphics g){
    // som uitkomsten
    g.drawString("seconden in een uur: " + uur, 50, 50);
    g.drawString("seconden in een dag: " + dag, 50, 70);
    g.drawString("seconden in een jaar: " + jaar, 50,90);
}
}


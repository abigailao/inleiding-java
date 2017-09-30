package h06;

/* Opdracht 6.2: Schrijf een applet, waarin berekend wordt hoeveel seconden er in een uur,
dag en jaar gaan en de uitkomst van de berekening in het venster van de applet toont.
 */

import java.awt.*;
import java.applet.*;

public class H06Odr02 extends Applet {

// secondes, een uur, een dag en een jaar.
int seconds;
int hour;
int day;
int year;

public void init(){
    // een minuut heeft 60 secondes.
    seconds = 60;
    // een uur heeft 60 minuten: 60 seconden * 60 minuten
    hour = seconds * 60;
    // een dag heeft 24 uur: 60 minuten * 24 uren
    day = hour * 24;
    // een jaar heeft 365 dagen: 24 uren * 365 dagen (m.u.v. het schrikkeljaar)
    year = day * 365; {
    }
}
public void paint(Graphics g){
    // som uitkomsten
    g.drawString("seconds in an hour: " + hour, 50, 50);
    g.drawString("seconds in a day: " + day, 50, 70);
    g.drawString("seconds in a year: " + year, 50,90);
}
}


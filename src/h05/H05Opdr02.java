package h05;

/* Opdracht 5.2: Maak opgave 4.4 (staafdiagram) nu opnieuw,
maar nu zodanig dat als je het gewicht van de kinderen verandert de staven automatisch worden aangepast als je de Applet uitvoert.
 */

        import java.awt.*;
        import java.applet.*;

public class H05Opdr02 extends Applet {
    int width;
    int kg100m;
    int kg100p;
    int nulpunt, Valerie2, Jeroen2, Hans2;
    int Valerie;
    int Jeroen;
    int Hans;

    public void init() {
        width = 50;
        kg100m = 33;
        kg100p = 26;
        nulpunt = 270;
        Valerie = 40;
        Jeroen = 100;
        Hans = 80;
        Valerie2 = nulpunt - Valerie;
        Jeroen2 = nulpunt - Jeroen;
        Hans2 = nulpunt - Hans;
    }

    public void paint(Graphics g) {

        g.drawLine(50,270,50,50);
        g.drawLine (320,270,50,270);
        g.drawString("Valerie", 80, 285);
        g.drawString("Jeroen", 160, 285);
        g.drawString("Hans", 240, 285);

        g.setColor(Color.lightGray);
        g.fillRect(75,Valerie2,width,Valerie);
        g.setColor(Color.gray);
        g.fillRect(150,Jeroen2,width,Jeroen);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(230,Hans2,width,Hans);

        g.drawString("KG 0",20,280);
        g.drawString("20", kg100m, 255);
        g.drawString("40", kg100m,235);
        g.drawString("60",kg100m,215);
        g.drawString("80",kg100m,195);
        g.drawString("100",kg100p,175);
        g.drawString("120",kg100p,155);
        g.drawString("140",kg100p,135);
        g.drawString("160",kg100p,115);
        g.drawString("180",kg100p,95);
        g.drawString("200",kg100p,75);
    }

}

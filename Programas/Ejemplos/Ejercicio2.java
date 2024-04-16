//Alexis De Jesus Perez Carmona     22290827

import java.awt.*;
import javax.swing.*;

public class Ejercicio2 extends JFrame {
    public Ejercicio2() {
        setBounds(10, 10, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        // Dibuja la cara
        g.setColor(Color.black);
        g.drawOval(200, 200, 300, 300);
        // Orejas
        g.fillOval(80, 90, 200, 200);
        g.fillOval(420, 90, 200, 200);
        // Cejas
        g.drawArc(260, 250, 80, 90, 0, 180);
        g.drawArc(360, 250, 80, 90, 0, 180);
        // Ojos
        g.drawOval(270, 270, 60, 100);
        g.drawOval(370, 270, 60, 100);

        g.drawArc(275, 315, 70, 70, 55, 120);
        g.drawArc(375, 315, 70, 70, 55, 120);

        g.drawArc(295, 346, 35, 30, 45, 170);
        g.drawArc(395, 346, 35, 30, 45, 170);
        // Nariz
        g.setColor(Color.DARK_GRAY);
        int x[] = { 335, 350, 365 };
        int y[] = { 390, 360, 390 };
        g.drawPolyline(x, y, 3);
        // Boca
        g.setColor(Color.RED);
        g.fillArc(275, 350, 150, 130, 5, -190);
        g.setColor(Color.DARK_GRAY);
        g.drawArc(275, 350, 150, 130, 5, -190);
        // Diente
        g.fillRect(335, 415, 30, 20);
        g.setColor(Color.white);
        g.fillRect(335, 415, 30, 20);

        // Estrella de 6 picos
        Polygon p = new Polygon();
        p.addPoint(700, 150); // cada punto del poligono
        p.addPoint(750, 225);
        p.addPoint(800, 150);
        g.setColor(Color.cyan);
        g.fillPolygon(p);
        p = new Polygon();
        p.addPoint(700, 200);
        p.addPoint(750, 120);
        p.addPoint(800, 200);
        g.fillPolygon(p);

        // Estrella 5 picos
        g.setColor(Color.DARK_GRAY);
        int x2[] = { 700, 800, 715, 750, 785, 700 };
        int y2[] = { 290, 290, 350, 250, 350, 290 };
        g.drawPolyline(x2, y2, 6);
    }

    public static void main(String[] args) {
        new Ejercicio2();
    }
}

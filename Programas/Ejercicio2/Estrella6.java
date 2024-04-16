package Ejercicio2;

import java.awt.*;
import javax.swing.*;

public class Estrella6 extends JFrame {
    public Estrella6() {
        setBounds(10, 10, 700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.DARK_GRAY);
        int x[] = { 100, 200, 115, 150, 185, 100 };
        int y[] = { 90, 90, 150, 50, 150, 90 };
        g.drawPolyline(x, y, 6);
    }

    public static void main(String[] args) {
        new Estrella6();
    }
}

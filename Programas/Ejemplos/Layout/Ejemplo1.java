package Layout;

import java.awt.*;
import javax.swing.*;

public class Ejemplo1 extends JFrame {
    public Ejemplo1() {
        setBounds(10, 10, 600, 500);
        getContentPane().setBackground(Color.lightGray);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        // lineas cruzadas
        g.setColor(Color.CYAN);
        g.drawRect(30, 100, 100, 1);
        g.setColor(Color.blue);
        g.drawRect(80, 50, 1, 100);
        // rectangulos
        g.setColor(Color.red);
        g.drawRect(140, 50, 100, 100);
        g.setColor(Color.pink);
        g.fillRect(150, 60, 80, 80);
        // Bordes redondeados
        g.setColor(Color.red);
        g.drawRoundRect(270, 50, 100, 100, 50, 50);
        g.fillRoundRect(280, 60, 80, 80, 25, 25);
        // Sombreado 3D
        g.setColor(Color.cyan);
        g.draw3DRect(30, 200, 100, 100, true);
        g.setColor(Color.green);
        g.draw3DRect(140, 200, 100, 100, false);
        // Circulos
        g.setColor(Color.black);
        g.drawOval(250, 200, 100, 100);
        g.setColor(Color.cyan);
        g.fillOval(260, 210, 80, 80);
        g.setColor(Color.blue);
        g.drawOval(270, 220, 60, 60);
        // Arcos
        g.drawArc(370, 200, 100, 100, 0, 180);
        g.fillArc(370, 200, 100, 100, 0, -180);
        // polilinea
        g.setColor(Color.BLUE);
        int x[] = { 75, 50, 100, 150, 131, 75 };
        g.drawPolyline(x, new int[] { 400, 350, 305, 350, 400, 400 }, 6);
        /*
         * int x[] = { 175, 150, 200, 250, 225 };
         * g.fillPolyline(x, new int[] { 400, 350, 310, 350, 400 }, 5);
         */
        // Poligonos
        Polygon p = new Polygon();
        p.addPoint(80, 390); // cada punto del poligono
        p.addPoint(60, 350);
        p.addPoint(100, 315);
        p.addPoint(140, 350);
        p.addPoint(125, 390);
        g.setColor(Color.black);
        g.drawPolygon(p);

        // Dibujar cadenas
        g.drawString("Hola Mundo", 200, 350);
        // Cambiar Tamaño de letra
        Font f = new Font("Dialog", Font.BOLD, 20);
        g.setFont(f);
        g.drawString("Hola Mundo 2.0", 200, 380);

        // Dibujar Caracteres
        char[] c = { 'A', 'L', 'E', 'X' };
        int x1 = 15;
        for (int i = 0; i < c.length; i++, x1 += 15) {
            g.drawChars(c, i, 1, 200 + x1, 400);
        }
        String cadena = "Hola ☺";
        // Convertir una cadena a caracteres
        // char data[] = cadena.toCharArray();
        // Otra forma
        cadena.getChars(0, cadena.length() - 1, c, 0);
        // Ejemplo
        char caracteres[] = new char[cadena.length()];
        cadena.getChars(0, cadena.length() - 1, caracteres, 0);

        // Copiar un area de dibujo
        g.copyArea(0, 0, 500, 500, 500, 500);

    }

    public static void main(String[] args) {
        new Ejemplo1();
    }
}

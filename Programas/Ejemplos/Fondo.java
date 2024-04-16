
//Alexis De Jesus Perez Carmona     22290827
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Fondo extends JFrame {
    BufferedImage bi;

    public Fondo() {
        setBounds(10, 10, 600, 600);
        setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        dibujar();
        g.drawImage(bi, 0, 35, this);
    }

    // Dibuja el fondo
    void dibujar() {
        int ancho = 600;
        int alto = 600;
        bi = new BufferedImage(alto, ancho, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        Polygon p = new Polygon();
        for (int i = 0; i < 14; i++) {
            p = new Polygon();
            for (int j = 0; j < 10; j++) {
                p.addPoint(random(600, 0), random(600, 0));
            }
            g.setColor(new Color(random(255, 0), random(255, 0), random(255, 0)));
            g.fillPolygon(p);
        }
        try {
            ImageIO.write(bi, "jpg", new File("miFondo.jpg"));
        } catch (Exception e) {
        }
    }

    // Genera numeros aleatorios
    public int random(int max, int min) {
        return (int) (Math.round(Math.random() * max)) + min;
    }

    public static void main(String[] args) throws IOException {
        new Fondo();
    }
}

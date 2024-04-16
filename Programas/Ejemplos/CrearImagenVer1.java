import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class CrearImagenVer1 {
    public static void main(String[] args) throws IOException {
        dibujar();
        System.err.println("Imagen Creada");
    }

    private static void dibujar() throws IOException {
        int ancho = 640;
        int alto = 480;
        BufferedImage bi = new BufferedImage(alto, ancho, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        g.setColor(Color.blue);
        g.fillRect(0, 0, ancho, alto);
        g.setColor(Color.red);
        g.fillOval(10, 10, 100, 100);
        g.setColor(Color.white);
        g.fillOval(60, 60, 100, 100);
        g.setColor(Color.green);
        g.fillOval(110, 110, 100, 100);
        g.dispose();
        ImageIO.write(bi, "jpg", new File("miDibujo.jpg"));

    }
}

package Layout;

import java.awt.*;
import javax.swing.*;

public class Ejemplo2 extends JFrame {
    Image im, im2;

    public Ejemplo2() {
        setBounds(10, 10, 600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        im = new ImageIcon(getClass().getResource("./imagen/2.png")).getImage();
        setVisible(true);
    }

    public void paint(Graphics g) {
        // Dibujar imagenes
        // g.drawImage(im, 10, 31, this);
        // g.drawImage(im2, 10, 31, this);
        // g.drawImage(im, 0, 31, Color.BLACK, this);
        // g.drawImage(im, 0, 31, 100, 100, this);
        // g.drawImage(im, 0, 31, int width, int height, Color bgcolor,this);
        // g.drawImage(im, 0, 31, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
        // this);
        g.drawImage(im, 0, 31, 300, 300, 500, 850, 1200, 1400, Color.black, this);

    }

    public static void main(String[] args) {
        new Ejemplo2();
    }
}

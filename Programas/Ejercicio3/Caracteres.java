//Alexis De Jesus Perez Carmona     22290827

import javax.swing.*;
import java.awt.*;

public class Caracteres extends JFrame {
    Image img;

    public Caracteres() {
        img = new ImageIcon("miFondo.jpg").getImage();
        setBounds(10, 10, 600, 600);
        getContentPane().setBackground(Color.lightGray);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Genera numeros aleatorios
    public int random(int max, int min) {
        return (int) (Math.round(Math.random() * max)) + min;
    }

    // Detiene el programa por cierto tiempo para crear una pequeña animación
    public void pausa(int t) throws InterruptedException {
        Thread.sleep(t);
    }

    // Se encarga de dibujar las letras
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img, 0, 32, this);

        char letras[] = new char[40];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = (char) random('a', 'z');
        }
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String f[] = ge.getAvailableFontFamilyNames();

        for (int i = 0; i < 10; i++) {
            g.setColor(new Color(random(255, 0), random(255, 0), random(255, 0)));
            g.setFont(new Font(
                    f[random(f.length, 0)],
                    random(2, 0),
                    random(50, 30)));
            g.drawChars(letras, random(40, 0), 1, random(560, 40), random(560, 40));

            try {
                pausa(100);
            } catch (InterruptedException ie) {
            }
        }
    }

    public static void main(String[] args) {
        new Caracteres();
    }
}

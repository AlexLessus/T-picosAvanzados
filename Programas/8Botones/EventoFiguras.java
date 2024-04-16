
//Alexis De Jesus Perez Carmona 22290827
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventoFiguras extends JFrame {
    JButton bIzq, bDer, bUp, bDown, bIncrease, bDecrease, bContorno, bRelleno;
    int x = 300, y = 100, width = 150, height = 150;
    Color c1 = Color.BLUE, c2 = Color.CYAN;

    public EventoFiguras() {
        setTitle("8 Botones");
        setBounds(100, 100, 1000, 800);
        Panel p = new Panel();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        p.setLayout(new FlowLayout(FlowLayout.LEFT));
        bIzq = new JButton("Mover Izquierda");
        bDer = new JButton("Mover Derecha");
        bUp = new JButton("Subir");
        bDown = new JButton("Bajar");
        bIncrease = new JButton("Grande");
        bDecrease = new JButton("Pequeño");
        bContorno = new JButton("Contorno");
        bRelleno = new JButton("Relleno");

        p.add(bIzq);
        p.add(bDer);
        p.add(bUp);
        p.add(bDown);
        p.add(bIncrease);
        p.add(bDecrease);
        p.add(bContorno);
        p.add(bRelleno);

        setResizable(false);
        add(p, "South");
        setVisible(true);

        bIzq.setMnemonic(KeyEvent.VK_I);
        bIzq.setIcon(new ImageIcon("Flecha izq2.jpg"));
        bIzq.setToolTipText("Mover Figura a la izquierda");
        bDer.setMnemonic(KeyEvent.VK_D);
        bDer.setToolTipText("Mover Figura a la derecha");
        bUp.setMnemonic(KeyEvent.VK_S);
        bUp.setToolTipText("Mover Figura arriba");
        bDown.setMnemonic(KeyEvent.VK_B);
        bDown.setToolTipText("Mover Figura abajo");
        bIncrease.setMnemonic(KeyEvent.VK_G);
        bIncrease.setToolTipText("Aumentar el tamaño de la figura");
        bDecrease.setMnemonic(KeyEvent.VK_P);
        bDecrease.setToolTipText("Dismunir el tamaño de la figura");
        // bContorno.setIcon(new ImageIcon("Contorno.gif"));
        bContorno.setMnemonic(KeyEvent.VK_C);
        bContorno.setToolTipText("Cambiar el color del contorno");
        // bRelleno.setIcon(new ImageIcon("Relleno.gif"));
        bRelleno.setMnemonic(KeyEvent.VK_R);
        bRelleno.setToolTipText("Cambiar el color del relleno");

        bIzq.addActionListener(e -> {
            if (x > 10) {
                x -= 8;
                repaint();
            }
        });
        bDer.addActionListener(e -> {
            if (x < 990 - width) {
                x += 8;
                repaint();
            }
        });
        bUp.addActionListener(e -> {
            if (y > 35) {
                y -= 4;
                repaint();
            }
        });
        bDown.addActionListener(e -> {
            if (y < 750 - height) {
                y += 4;
                repaint();
            }
        });
        bIncrease.addActionListener(e -> {
            if (width < 300) {
                width += 3;
                height += 3;
                repaint();
            }
        });
        bDecrease.addActionListener(e -> {
            if (width > 50) {
                width -= 3;
                height -= 3;
                repaint();
            }
        });
        bContorno.addActionListener(e -> {
            c1 = new Color(random(255, 0), random(255, 0), random(255, 0));
            repaint();
        });
        bRelleno.addActionListener(e -> {
            c2 = new Color(random(255, 0), random(255, 0), random(255, 0));
            repaint();
        });

    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(c1);
        g.drawRect(x, y, width, height);
        g.setColor(c2);
        g.fillRect(x + 1, y + 1, width - 1, height - 1);

    }

    public int random(int max, int min) {
        return (int) (Math.round(Math.random() * max)) + min;
    }

    public static void main(String[] args) {
        new EventoFiguras();
    }
}

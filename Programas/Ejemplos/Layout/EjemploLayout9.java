package Layout;

//Alexis De Jesus Perez Carmona     22290827        7:00am - 9:00am
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EjemploLayout9 extends JFrame {
    JButton b1, b2, b3, b4;
    JLabel l1;

    public EjemploLayout9() {
        setBounds(100, 100, 600, 400);

        b1 = new JButton("Salir");
        b2 = new JButton("Cambio 1");
        b3 = new JButton("Cambio 2");
        b4 = new JButton("Cambiar color");
        l1 = new JLabel("   Voy a cambiar");
        // Hace que el fondo del label sea opaco para visualizar el cambio de colores
        l1.setOpaque(true);
        // Al presionar b1 ejecuta el codigo dentro
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("    Cambio 1");
            }
        });
        // funcion lambda
        b3.addActionListener(e -> l1.setText("   Cambio 2"));
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cambia aleatoriamente el color de fondo
                l1.setBackground(new Color(random(255, 0), random(255, 0), random(255, 0)));
                l1.setText("    Cambio de color");
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add("North", b1);
        add("West", b2);
        add("East", b3);
        add("South", b4);
        add("Center", l1);
        setVisible(true);
    }

    // Genera numeros aleatorios
    public int random(int max, int min) {
        return (int) (Math.round(Math.random() * max)) + min;
    }

    public static void main(String[] args) {
        new EjemploLayout9();
    }

}

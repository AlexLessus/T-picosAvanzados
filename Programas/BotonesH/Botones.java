package BotonesH;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Botones extends JFrame {
    JButton bHab, bDes, bCirculo, bCuadrado, bLinea, bTriangulo, bFoto, bSalir;
    int figura = 0;// 1=Circulo 2=Cuadrado 3=Linea 4=Triangulo 5=Foto

    public Botones() {
        setTitle("Botones");
        setBounds(100, 100, 1050, 800);
        Panel p = new Panel();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Font f = new Font("Font.BOLD", 2, 40);
        p.setLayout(new FlowLayout(FlowLayout.LEFT));
        bHab = new JButton("Habilitar");
        bDes = new JButton("Deshabilitar");
        bCirculo = new JButton(new ImageIcon("BotonesH\\Circulo.jpg"));
        bCuadrado = new JButton(new ImageIcon("BotonesH\\Cuadrado.jpg"));
        bLinea = new JButton(new ImageIcon("BotonesH\\Linea.jpg"));
        bTriangulo = new JButton(new ImageIcon("BotonesH\\Triangulo.jpg"));
        bFoto = new JButton(new ImageIcon("BotonesH\\Foto.jpg"));
        bSalir = new JButton("Salir");

        bHab.setFont(f);
        bDes.setFont(f);
        bSalir.setFont(f);

        bDes.setEnabled(false);
        bCirculo.setEnabled(false);
        bCuadrado.setEnabled(false);
        bLinea.setEnabled(false);
        bTriangulo.setEnabled(false);
        bFoto.setEnabled(false);

        p.add(bHab);
        p.add(bDes);
        p.add(bCirculo);
        p.add(bCuadrado);
        p.add(bLinea);
        p.add(bTriangulo);
        p.add(bFoto);
        p.add(bSalir);

        setResizable(false);
        add(p, "South");
        setVisible(true);

        bHab.addActionListener(e -> {
            bHab.setEnabled(false);
            bDes.setEnabled(true);
            bCirculo.setEnabled(true);
            bCuadrado.setEnabled(true);
            bLinea.setEnabled(true);
            bTriangulo.setEnabled(true);
            bFoto.setEnabled(true);
        });
        bDes.addActionListener(e -> {
            bHab.setEnabled(true);
            bDes.setEnabled(false);
            bCirculo.setEnabled(false);
            bCuadrado.setEnabled(false);
            bLinea.setEnabled(false);
            bTriangulo.setEnabled(false);
            bFoto.setEnabled(false);
        });
        bCirculo.addActionListener(e -> {
            figura = 1;
            repaint();
        });
        bCuadrado.addActionListener(e -> {
            figura = 2;
            repaint();
        });
        bLinea.addActionListener(e -> {
            figura = 3;
            repaint();
        });
        bTriangulo.addActionListener(e -> {
            figura = 4;
            repaint();
        });
        bFoto.addActionListener(e -> {
            figura = 5;
            repaint();
        });

        bSalir.addActionListener(e -> {
            System.exit(0);
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        switch (figura) {
            case 1:
                g.fillOval(400, 300, 200, 200);
                break;
            case 2:
                g.fillRect(400, 300, 200, 200);
                break;
            case 3:
                g.drawLine(400, 300, 700, 300);
                break;
            case 4:
                Polygon p = new Polygon();
                p.addPoint(300, 550);
                p.addPoint(500, 300);
                p.addPoint(700, 550);
                g.fillPolygon(p);
                break;
            case 5:
                g.drawImage(new ImageIcon("BotonesH\\Foto2.jpg").getImage(), 400, 250, 300, 300, this);
                break;

            default:
                break;
        }
    }

    public static void main(String[] args) {
        new Botones();
    }
}

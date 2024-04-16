package ManejoDeEventos;

import java.awt.*;
import java.awt.event.*; // se importa el paquete para el manejo de eventos

public class EventosDeRaton extends Frame implements MouseListener, MouseMotionListener {
    Label edo; // declara un objeto de la clase Label (etiqueta)

    public EventosDeRaton() // método constructor
    {
        super("ejemplo de eventos del raton"); // llama a la superclase (Frame) y pone titulo al Frame
        edo = new Label(); // crea el objeto edo, que es una instancia de la clase Label (etiqueta)
        add(edo, BorderLayout.SOUTH); // añade la etiqueta al Frame
        addMouseListener(this); // activa el escucha de los eventos del raton
        addMouseMotionListener(this); // activa el escucha de los eventos del raton
        setSize(600, 600); // tamaño del Frame
        setVisible(true); // hace visible al Frame
    }

    // métodos que están contenidos en la interface MouseListener, invocados por el
    // método escucha
    // addMouseListener(this);
    // e.getX(),e.getY(), obtienen las coordenadas del raton
    public void mouseClicked(MouseEvent e) {
        edo.setText("click " + e.getX() + "," + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        edo.setText("presiono " + e.getX() + "," + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        edo.setText("suelto " + e.getX() + "," + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        edo.setText("entro " + e.getX() + "," + e.getY());
    }

    public void mouseExited(MouseEvent e) {
        edo.setText("salgo " + e.getX() + "," + e.getY());
    }

    // métodos que están contenidos en la interface MouseMotionListener, invocados
    // por el método escucha
    // addMouseMotionListener(this);
    public void mouseDragged(MouseEvent e) {
        edo.setText("arrastro " + e.getX() + "," + e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        edo.setText("muevo " + e.getX() + "," + e.getY());
    }

    public static void main(String arg[]) {
        EventosDeRaton er = new EventosDeRaton();
        er.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
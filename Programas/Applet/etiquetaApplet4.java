package Applet;

import java.awt.*;

public class etiquetaApplet4 extends Frame {
    public etiquetaApplet4() {
        setLayout(new FlowLayout());
        // creo cinco etiqutas
        Label l1 = new Label();
        Label l2 = new Label("etiqueta 2");
        Label l3 = new Label("etiqueta 3", Label.LEFT);
        Label l4 = new Label("etiqueta 4", Label.CENTER);
        Label l5 = new Label("etiqueta 5", Label.RIGHT);
        // se agregan las etiquetas al panel del applet
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        l1.setText("etiqueta 1");

        setBounds(100, 100, 400, 600);
        addWindowListener(new CerrarVentana());
        setVisible(true);
    }

    public static void main(String[] args) {
        etiquetaApplet4 f = new etiquetaApplet4();
    }
}

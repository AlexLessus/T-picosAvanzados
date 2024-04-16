package Applet;

import java.awt.*;

public class etiquetaApplet2 extends Panel {
    public etiquetaApplet2() {// creo cinco etiqutas
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
    }

    public static void main(String[] args) {
        Frame f = new Frame();
        etiquetaApplet2 obj = new etiquetaApplet2();
        f.add(obj);
        f.setBounds(100, 100, 400, 600);
        f.addWindowListener(new CerrarVentana());
        f.setVisible(true);
    }
}

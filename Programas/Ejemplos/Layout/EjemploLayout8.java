 package Layout;
import java.awt.*;
import javax.swing.*;

public class EjemploLayout8 extends JPanel {
    public EjemploLayout8() {
        add(new JButton("boton"));
        add(new JLabel("Etiqueta swing"));
        add(new Button("Boton"));
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Ejemplo7");
        // f.setLocation(100, 100);
        // f.setSize(600, 400);
        // f.setBounds(100, 100, 600, 400);
        f.add(new EjemploLayout8());
        f.setPreferredSize(new Dimension(600, 400));
        f.pack();
        f.setIconImage(new ImageIcon("miFondo.jpg").getImage());
        f.setTitle("Pruebas JFrame");
        f.setResizable(true);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                f.add(new JButton("Gola"));
                f.setVisible(true);
            }
        });
    }

}

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class EjemploBordes2 extends JFrame {
    public EjemploBordes2() {
        setSize(600, 400);
        // getContentPane().setBackground(Color.gray);
        setLayout(new GridLayout(4, 3, 10, 10));
        JPanel p[] = new JPanel[12];
        for (int i = 0; i < p.length; i++) {
            p[i] = new JPanel();
        }
        p[0].setBorder(BorderFactory.createLineBorder(Color.magenta));
        p[1].setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        p[2].setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        p[3].setBorder(BorderFactory.createRaisedBevelBorder());
        p[4].setBorder(BorderFactory.createLoweredBevelBorder());
        p[5].setBorder(BorderFactory.createEmptyBorder());
        p[6].setBorder(BorderFactory.createTitledBorder("titulo"));
        p[7].setBorder(BorderFactory.createMatteBorder(-1, -1, -1, -1, new ImageIcon("middle.gif")));
        p[8].setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.red));
        p[9].setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLoweredBevelBorder(), "title",
                TitledBorder.CENTER,
                TitledBorder.BELOW_BOTTOM));
        p[10].setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createLineBorder(Color.pink), "Combinado", TitledBorder.CENTER,
                        TitledBorder.DEFAULT_POSITION),
                BorderFactory.createMatteBorder(0, 20, 0, 0, new ImageIcon("imagenesAuxiliares/DogCh.gif"))));

        for (int i = 0; i < p.length; i++) {
            add(p[i]);
        }
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String arg[]) {
        new EjemploBordes2();
    }
}
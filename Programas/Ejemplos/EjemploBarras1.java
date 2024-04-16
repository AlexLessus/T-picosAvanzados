
//Alexis De Jesus Perez Carmona     22290827
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjemploBarras1 extends JFrame implements AdjustmentListener {
    // rojo verde azul
    int r, v, a, x = 200, y = 100, h = 200, w = 200;
    Scrollbar br, bv, ba;
    JScrollBar bx, by, bw, bh;

    public EjemploBarras1() {
        JPanel p = new JPanel(), p2 = new JPanel();
        p.setLayout(new GridLayout(3, 1));
        br = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        ba = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        bv = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        bx = new JScrollBar(Scrollbar.HORIZONTAL, 200, 1, 0, 600);
        by = new JScrollBar(Scrollbar.VERTICAL, 100, 1, 0, 400);
        bw = new JScrollBar(Scrollbar.VERTICAL, 200, 1, 0, 350);
        bh = new JScrollBar(Scrollbar.VERTICAL, 200, 1, 0, 350);

        p.add(br);
        p.add(ba);
        p.add(bv);

        br.addAdjustmentListener(this);
        bv.addAdjustmentListener(this);
        ba.addAdjustmentListener(this);
        bx.addAdjustmentListener(this);
        by.addAdjustmentListener(this);
        bh.addAdjustmentListener(this);
        bw.addAdjustmentListener(this);

        add("South", p);

        p2.setLayout(new GridLayout(1, 2));
        p2.add(bw);
        p2.add(bh);
        add("East", p2);
        add("North", bx);
        add("West", by);
        setBounds(100, 100, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        r = br.getValue();
        v = bv.getValue();
        a = ba.getValue();
        x = bx.getValue();
        y = by.getValue();
        h = bh.getValue();
        w = bw.getValue();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(r, v, a));
        g.fillOval(x, y, w, h);
    }

    public static void main(String[] args) {
        new EjemploBarras1();
    }

}

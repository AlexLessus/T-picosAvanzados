package Listas;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class List1 extends JFrame implements ItemListener {
    Choice list;
    String str = "";
    Color color = Color.white;

    public List1() {
        setLayout(new FlowLayout());
        list = new Choice();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("pink");

        add(list);
        list.addItemListener(this);
        setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        int i = list.getSelectedIndex();
        str = list.getSelectedItem();
        switch (i) {
            case 0:
                color = Color.red;
                break;
            case 1:
                color = Color.green;
                break;
            case 2:
                color = Color.blue;
                break;
            case 3:
                color = Color.pink;
                break;
            default:
                break;
        }
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(color);
        setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 30));
        g.drawString(str, 150, 300);
    }

    public static void main(String[] args) {
        new List1();
    }
}

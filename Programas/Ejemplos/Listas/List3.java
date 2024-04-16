package Listas;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class List3 extends JFrame implements ActionListener {
    List list;
    String str[];
    Color color = Color.white;

    public List3() {
        setLayout(new FlowLayout());

        list = new List(4, true);
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("purple");
        list.add("pink");
        add(list);

        list.addActionListener(this);
        setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int i = list.getSelectedIndex();
        str = list.getSelectedItems();
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
                color = Color.MAGENTA;
                break;
            case 4:
                color = Color.pink;
                break;
            default:
                break;
        }
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        int x = 4;
        setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 30));
        g.setColor(color);
        if (str != null)
            for (int i = 0; i < str.length; i++) {
                g.drawString(str[i], 150, 300 + x);
                x += 40;
            }
    }

    public static void main(String[] args) {
        new List3();
    }

}

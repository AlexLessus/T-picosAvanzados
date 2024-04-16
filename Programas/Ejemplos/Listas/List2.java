package Listas;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class List2 extends JFrame implements ActionListener {
    // JComboBox list;
    JComboBox<String[]> list;
    String str = "";
    Color color = Color.white;

    public List2() {
        setLayout(new FlowLayout());
        String elements[] = { "red", "green", "blue", "pink" };

        list = new JComboBox(elements);
        add(list);
        list.addActionListener(this);
        setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int i = list.getSelectedIndex();
        str = (String) list.getSelectedItem();
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
        new List2();
    }

}

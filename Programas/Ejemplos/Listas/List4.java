package Listas;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class List4 extends JFrame implements ListSelectionListener {
    JTextArea txt;
    JList<String> list;

    public List4() {
        setLayout(new FlowLayout());
        String data[] = { "red", "blue", "green", "purlple", "cyan", "black", "white", "gray", "pink", "orange",
                "Exit" };
        list = new JList<>(data);
        JScrollPane scroll = new JScrollPane(list);
        txt = new JTextArea(20, 30);

        list.setVisibleRowCount(4);
        list.setSelectionBackground(Color.gray);
        list.setSelectionForeground(Color.white);

        add(scroll);
        add(txt);

        list.addListSelectionListener(this);
        setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void valueChanged(ListSelectionEvent e) {
        txt.setText(list.getSelectedValue());
        if (list.getSelectedIndex() == 10) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new List4();
    }
}

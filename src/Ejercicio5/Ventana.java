package Ejercicio5;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    private JLabel l1, l2;
    private JTextArea cuerpo;
    private JTextField email;
    private JScrollPane scroll;

    public Ventana() {
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("OutLook");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\outlook.png"));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0, 114, 202, 255));
        //-------------------------
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        l1 = new JLabel("mail");
        l1.setBounds(30, 20, 30, 15);
        l1.setForeground(Color.WHITE);
        l1.setAlignmentX(CENTER_ALIGNMENT);
        this.add(l1);
        email = new JTextField();
        email.setBounds(80, 20, 150, 20);
        email.setAlignmentX(CENTER_ALIGNMENT);
        email.setBorder(null);
        this.add(email);
        //---------------------------------
        l2 = new JLabel("mensje");
        l2.setBounds(30, 60, 50, 15);
        l2.setForeground(Color.WHITE);
        l2.setAlignmentX(CENTER_ALIGNMENT);
        this.add(l2);
        cuerpo = new JTextArea();
        cuerpo.setLineWrap(true);
        scroll = new JScrollPane(cuerpo);
        scroll.setBorder(null);
        scroll.setBounds(30, 80, 200, 150);
        this.add(scroll);
    }

    public static void main(String[] args) {

        Ventana v = new Ventana();

    }

}

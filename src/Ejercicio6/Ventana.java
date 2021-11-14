package Ejercicio6;

import Ejercicio5.*;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    private JLabel l1, l2;
    private JTextArea cuerpo;
    private JTextField email;
    private JScrollPane scroll;
    private JButton btn;

    public Ventana() {
        this.setSize(300, 350);
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
        //------------------------
        btn = new JButton("Enviar");
        btn.setBounds(100, 270, 80, 20);
        btn.setAlignmentX(CENTER_ALIGNMENT);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String mensaje = cuerpo.getText();
                if (mensaje.contains("argentina")) {
                    JOptionPane.showMessageDialog(null, "Mensaje enviado");
                    cuerpo.setText(null);
                    email.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "TU MENSAJE NO PUDO "
                            + "SER ENVIADO,"
                            + "\nPORQUE NO CONTIENE LA STRING: "
                            + "\nargentina ", null, JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        this.add(btn);
    }

    public static void main(String[] args) {

        Ventana v = new Ventana();

    }

}

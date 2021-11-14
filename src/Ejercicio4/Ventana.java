package Ejercicio4;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    private JLabel labelnom, labelpasw;
    private JTextField nombre, paswd;
    private JButton enter;

    public Ventana() {
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("ACCESO USUARIOS");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\personaLog.png"));
        this.getContentPane().setBackground(new Color(99, 188, 176, 255));
        this.setResizable(false);
        //----------------------------
        initComponentes();
        //-----------------------------------------
        this.setVisible(true);
    }

    public void initComponentes() {

        labelnom = new JLabel("Nombre");
        labelnom.setBounds(50, 70, 80, 30);
        labelnom.setAlignmentX(CENTER_ALIGNMENT);
        this.add(labelnom);
        nombre = new JTextField();
        nombre.setBounds(130, 70, 80, 30);
        nombre.setAlignmentX(CENTER_ALIGNMENT);
        this.add(nombre);
        //------------------------------
        labelpasw = new JLabel("Contraseña");
        labelpasw.setBounds(50, 130, 80, 30);
        labelpasw.setAlignmentX(CENTER_ALIGNMENT);
        this.add(labelpasw);
        paswd = new JTextField();
        paswd.setBounds(130, 130, 80, 30);
        paswd.setAlignmentX(CENTER_ALIGNMENT);
        this.add(paswd);
        //--------------------------------------
        enter = new JButton("LOGIN");
        enter.setBounds(108, 190, 80, 30);
        enter.setAlignmentX(CENTER_ALIGNMENT);
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nombre.getText().equalsIgnoreCase("juan") && paswd.getText().equals("abc123")) {
                    setTitle("Juan");
                    nombre.setText(null);
                    paswd.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, ("Usuario Incorrecto").toUpperCase(),null,JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        this.add(enter);

    }

    public static void main(String[] args) {

        Ventana v = new Ventana();
    }

}

//-----------------------------------------------


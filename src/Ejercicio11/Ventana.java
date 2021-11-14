package Ejercicio11;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana extends JFrame {

    private JCheckBox check;
    private JLabel l;
    private JButton btn;

    public Ventana() {
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\personaLog.png"));
        getContentPane().setBackground(Color.WHITE);
        getContentPane().add(new JPanel(), CENTER_ALIGNMENT);
        initComponetes();
        setVisible(true);
    }

    private void initComponetes() {
        check = new JCheckBox();
        check.setBounds(30, 20, 20, 20);
        add(check);
        //-------------------------
        check.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (check.isSelected()) {
                    btn.setEnabled(true);
                }
            }
        });
        //--------------------------
        l = new JLabel("¿Está de acuerdo con las normas del servicio?");
        l.setBounds(70, 20, 300, 20);
        add(l);
        //-------------------
        btn = new JButton("Aceptar");
        btn.setBounds(145, 70, 100, 20);
        btn.setEnabled(false);
        add(btn);
        //---------------------------------
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
    }

}

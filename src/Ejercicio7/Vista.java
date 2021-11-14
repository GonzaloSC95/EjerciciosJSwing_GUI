package Ejercicio7;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Vista extends JFrame {

    private JTextArea cuerpo1, cuerpo2;
    private JScrollPane scrool1, scrool2;
    private JLabel label1, label2;
    private JButton btn;

    public Vista() {
        setSize(470, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(0, 114, 202, 255));
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\outlook.png"));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponets();
        setVisible(true);
    }

    private void initComponets() {
        label1 = new JLabel("Mensaje 1");
        label1.setBounds(40, 20, 60, 20);
        label1.setForeground(Color.WHITE);
        label1.setAlignmentX(CENTER_ALIGNMENT);
        this.add(label1);
        label2 = new JLabel("Mensaje 2");
        label2.setBounds(250, 20, 60, 20);
        label2.setAlignmentX(CENTER_ALIGNMENT);
        label2.setForeground(Color.WHITE);
        this.add(label2);
        //--------------------------------------
        cuerpo1 = new JTextArea();
        cuerpo1.setLineWrap(true);
        scrool1 = new JScrollPane(cuerpo1);
        scrool1.setAlignmentX(CENTER_ALIGNMENT);
        scrool1.setBounds(40, 40, 180, 160);
        scrool1.setBorder(null);
        this.add(scrool1);
        cuerpo2 = new JTextArea();
        cuerpo2.setLineWrap(true);
        scrool2 = new JScrollPane(cuerpo2);
        scrool2.setBounds(240, 40, 180, 160);
        scrool2.setBorder(null);
        scrool2.setAlignmentX(CENTER_ALIGNMENT);
        this.add(scrool2);
        //-------------------------------
        btn = new JButton("Comparar");
        btn.setBounds(170, 215, 100, 30);
        btn.setFont(new Font("Arial",Font.BOLD,15));
        btn.setBackground(Color.WHITE);
        btn.setBorder(null);
        this.add(btn);
        //--------------------------------------------------
        btn.addActionListener(new Evento(this));

    }

    public JTextArea getCuerpo1() {
        return cuerpo1;
    }

    public JTextArea getCuerpo2() {
        return cuerpo2;
    }

    public JScrollPane getScrool1() {
        return scrool1;
    }

    public JScrollPane getScrool2() {
        return scrool2;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public JButton getBtn() {
        return btn;
    }
    
    

}

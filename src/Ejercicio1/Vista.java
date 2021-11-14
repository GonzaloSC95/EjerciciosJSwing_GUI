package Ejercicio1;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Vista extends JFrame {
    
    private JButton b1,b2,b3,reset;

    public Vista() {
        this.setSize(300, 450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(223,125,64,255));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\presstour.png"));
        this.setLayout(null);
        this.initComponentes();
        //--------------------
        this.setVisible(true);
    }

    public void initComponentes() {
        int dist=80;
        ///------------------
        b1= new JButton("1");
        b1.setBounds(115, 60, 50, 50);
        this.add(b1);
        //----------
        b2=new JButton("2");
        b2.setBounds(115, 60+dist, 50, 50);
        this.add(b2);
        //-------------
        b3=new JButton ("3");
        b3.setBounds(115, 60+(dist*2), 50, 50);
        this.add(b3);
        //-----------------
        reset=new JButton ("Borrar");
        reset.setBounds(100, 60+(dist*3), 80, 50);
        this.add(reset);
        //---------EVENTOS-----------------------
        b1.addActionListener(new Evento(this));
        b2.addActionListener(new Evento(this));
        b3.addActionListener(new Evento(this));
        reset.addActionListener(new Evento(this));
    }

    //--GETTERS-----------------------------
    public JButton getB1() {
        return b1;
    }

    public JButton getB2() {
        return b2;
    }

    public JButton getB3() {
        return b3;
    }
    
    public JButton getReset() {
        return reset;
    }

}

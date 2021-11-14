package Ejercicio2;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vista extends JFrame {
    
    private JTextField cajaTexto;
    private JLabel texto;
    private JButton btn,reset;

    public Vista() {
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(Color.BITMASK));
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\DENTALTIX.jpg"));
        setLayout(null);
        initComponents();
        setVisible(true);
    }

    public void initComponents() {
        int dist=80;
        //---------------
        texto=new JLabel("Nombre:");
        texto.setBounds(30, 80, 150, 30);
        texto.setForeground(Color.WHITE);
        this.add(texto);
        //---------------------
        cajaTexto=new JTextField();
        cajaTexto.setBounds(100, 80, 150, 30);
        this.add(cajaTexto);
        //-------------------
        btn=new JButton("ENVIAR");
        btn.setBounds(80, 80+dist, 150, 30);
        this.add(btn);
        //-------------------
        reset=new JButton("BORRAR");
        reset.setBounds(80, 80+(dist*2), 150, 30);
        this.add(reset);
        //---------------------------
        btn.addActionListener(new Evento(this));
        reset.addActionListener(new Evento(this));
        
    }

    //-------GETTERS--------------
    public JTextField getCajaTexto() {
        return cajaTexto;
    }

    public JButton getBtn() {
        return btn;
    }
    
    public JButton getReset() {
        return reset;
    }
    
    
    

}

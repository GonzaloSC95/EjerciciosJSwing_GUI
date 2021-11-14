package Ejercicio9;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame {
    
    private JComboBox rojo,verde,azul;
    private JLabel lrojo,lverde,lazul;
    private JButton btn;
    
    public Ventana() {
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\espana.png"));
        initComponets();
        setVisible(true);
    }
    
    private void initComponets() {
        int x=40;
        int y = 35;
        //----------ROJO----------
        lrojo=new JLabel("Rojo");
        lrojo.setBounds(x, y, 50, 20);
        this.add(lrojo);
        rojo=new JComboBox();
        rojo.setBounds(x*2, y, 50, 20);
        for (int i = 0; i <= 255; i++) {
            rojo.addItem(i);
        }
        this.add(rojo);
        //-------VERDE---------------
        lverde=new JLabel("Verde");
        lverde.setBounds(x, y*3, 50, 20);
        this.add(lverde);
        verde=new JComboBox();
        verde.setBounds(x*2, y*3, 50, 20);
        for (int i = 0; i <= 255; i++) {
            verde.addItem(i);
        }
        this.add(verde);
        //-----------AZUL------------------
        lazul=new JLabel("Azul");
        lazul.setBounds(x, y*5, 50, 20);
        this.add(lazul);
        azul=new JComboBox();
        azul.setBounds(x*2, y*5, 50, 20);
        for (int i = 0; i <= 255; i++) {
            azul.addItem(i);
        }
        this.add(azul);
        //---------BOTON------------
        btn=new JButton("Fijar Color");
        btn.setBounds(x*4, y*3, 100, 20);
        this.add(btn);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r = Integer.parseInt(rojo.getSelectedItem().toString());
                int v = Integer.parseInt(verde.getSelectedItem().toString());
                int a = Integer.parseInt(azul.getSelectedItem().toString());
                //-------------------------------------------
                btn.setBackground(new Color(r,v,a));
            }
        });
    }
    
    public static void main(String[] args) {
        Ventana v = new Ventana();
    }
    
}

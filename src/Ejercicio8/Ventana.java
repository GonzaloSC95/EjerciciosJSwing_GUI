package Ejercicio8;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    
    private JComboBox colores;
    
    public Ventana() {
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\reino-unido.png"));
        initComponets();
        setVisible(true);
    }
    
    private void initComponets() {
        colores = new JComboBox();
        colores.setBounds(30, 20, 80, 20);
        colores.addItem("Rojo");
        colores.addItem("Amarillo");
        colores.addItem("Azul");
        colores.addItem("Verde");
        colores.addItem("Blanco");
        this.add(colores);
        this.setTitle(colores.getSelectedItem().toString());
        colores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = colores.getSelectedItem().toString();
                setTitle(color);
                
            }
        });
        
    }
    
    public static void main(String[] args) {
        Ventana v = new Ventana();
    }
    
}

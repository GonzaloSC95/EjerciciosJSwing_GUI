package Ejercicio13;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evento implements ActionListener {
    
    private Vista ventana;

    public Evento(Vista ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(ventana.getRojo())) {
            ventana.getContentPane().setBackground(Color.red);
        } else if (e.getSource().equals(ventana.getVerde())) {
            ventana.getContentPane().setBackground(Color.green);
        } else if (e.getSource().equals(ventana.getT400())) {
            ventana.setSize(400, 400);
        } else if (e.getSource().equals(ventana.getT600())){
            ventana.setSize(600, 600);
        }
    }

}

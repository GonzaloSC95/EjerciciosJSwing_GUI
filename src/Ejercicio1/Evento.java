package Ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evento implements ActionListener {

    private Vista ventana;

    public Evento(Vista ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(ventana.getB1())) {
            ventana.setTitle("Has pulsado el nº " + 1);
        } else if (e.getSource().equals(ventana.getB2())) {
            ventana.setTitle("Has pulsado el nº " + 2);
        } else if (e.getSource().equals(ventana.getB3())) {
            ventana.setTitle("Has pulsado el nº " + 3);
        } else if (e.getSource().equals(ventana.getReset())) {
            ventana.setTitle(null);

        }
    }
}

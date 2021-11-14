package Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evento implements ActionListener {

    private Vista ventana;

    public Evento(Vista ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ventana.getBtn())) {
            String nombre = ventana.getCajaTexto().getText();
            if (nombre.equals("")) {
                ventana.setTitle("No hay nombre :(");
            } else {
                ventana.setTitle(nombre);
            }
        } else if (e.getSource().equals(ventana.getReset())) {
            ventana.setTitle(null);
        }
    }

}

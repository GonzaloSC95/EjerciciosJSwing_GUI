package Ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Evento implements ActionListener {

    private Vista ventana;

    public Evento(Vista ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(ventana.getBtn())) {
            try {

                int num1 = Integer.parseInt(ventana.getNum1().getText());
                int num2 = Integer.parseInt(ventana.getNum2().getText());
                int suma = num1 + num2;

                ventana.getResultado().setText(String.valueOf(suma));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "DEBES INTRODUCIR NUMEROS", null, JOptionPane.ERROR_MESSAGE);
            }

        } else if (e.getSource().equals(ventana.getReset())) {
            ventana.getNum1().setText(null);
            ventana.getNum2().setText(null);
            ventana.getResultado().setText(null);
        }

    }

}

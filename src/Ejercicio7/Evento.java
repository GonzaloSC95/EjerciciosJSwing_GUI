package Ejercicio7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Evento implements ActionListener {
    
    private Vista ventana;
    
    public Evento (Vista ventana) {
        this.ventana=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mensaje1=ventana.getCuerpo1().getText();
        String mensaje2=ventana.getCuerpo2().getText();
        if (mensaje1.equalsIgnoreCase(mensaje2)) {
            JOptionPane.showInternalMessageDialog(null, "Ambos mensajes son iguales", 
                    "Comparacion de mensajes", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showInternalMessageDialog(null, "Los mensajes no son iguales", 
                    "Comparacion de mensajes", JOptionPane.ERROR_MESSAGE);
        }
        ventana.getCuerpo1().setText(null);ventana.getCuerpo2().setText(null);
        
    }

}

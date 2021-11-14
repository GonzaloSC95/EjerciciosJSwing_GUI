package Ejercicio10;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    private JLabel lnom, lpais;
    private JTextField nombre;
    private JComboBox pais;
    private JButton btn;

    public Ventana() {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\personaLog.png"));
        getContentPane().setBackground(Color.WHITE);
        getContentPane().add(new JPanel(), CENTER_ALIGNMENT);
        //--------------------------
        initComponetes();
        //----------------------------
        setVisible(true);
    }

    private void initComponetes() {
        lnom = new JLabel("Nombre");
        lnom.setBounds(30, 20, 100, 20);
        this.add(lnom);
        lpais = new JLabel("Pais");
        lpais.setBounds(30, 50, 100, 20);
        this.add(lpais);
        //---------------------
        try {
            Font normandia = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("normandia.ttf"));
            lpais.setFont(normandia.deriveFont(Font.BOLD, 15f));
            lnom.setFont(normandia.deriveFont(Font.BOLD, 15f));
        } catch (FontFormatException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //---------------------------------
        nombre = new JTextField();
        nombre.setBounds(130, 20, 100, 20);
        this.add(nombre);
        //---------------------------
        pais = new JComboBox();
        pais.setBounds(130, 50, 100, 20);
        pais.addItem("España");
        pais.addItem("Inglaterra");
        this.add(pais);
        //-----------------------
        btn = new JButton("Aceptar");
        btn.setBounds(90, 100, 100, 20);
        this.add(btn);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle(nombre.getText());
                String p = pais.getSelectedItem().toString();
                if (p.equalsIgnoreCase("España")) {
                    setIconImage(Toolkit.getDefaultToolkit().getImage("img\\espana.png"));
                } else if (p.equalsIgnoreCase("Inglaterra")) {
                    setIconImage(Toolkit.getDefaultToolkit().getImage("img\\reino-unido.png"));
                }
            }
        });

    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
    }

}

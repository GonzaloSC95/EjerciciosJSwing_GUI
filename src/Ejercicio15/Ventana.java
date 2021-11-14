package Ejercicio15;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame {
    private JRadioButton r640x480, r800x600, r1024x768, r300x200;
    //GRUPO PARA QUE SOLO SE PUEDA ELEGIR UN RADIOBUTTON 
    private ButtonGroup grupo_radioButton;
    public Ventana() {
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().add(new JPanel(), CENTER_ALIGNMENT);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\personalog.png"));
        setResizable(false);
        setTitle("Gonzalo Solís");
        initComponents();
        setVisible(true);
    }
    private void initComponents() {
        //CREAMOS EL GRUPO DE BOTONES-------
        grupo_radioButton = new ButtonGroup();
        //CREAMOS LOS RADIOBUTTONS----------------
        r300x200 = new JRadioButton("300x200");
        r640x480 = new JRadioButton("640x480");
        r800x600 = new JRadioButton("800x600");
        r1024x768 = new JRadioButton("1024x768");
        //----------------------------------------
        r300x200.setBounds(30, 20, 100, 20);
        r640x480.setBounds(30, 50, 100, 20);
        r800x600.setBounds(30, 80, 100, 20);
        r1024x768.setBounds(30, 110, 100, 20);
        //AÑADIMOS LOS BOTONES AL GRUPO DE RADIOBUTTONS-------
        grupo_radioButton.add(r300x200);grupo_radioButton.add(r800x600);
        grupo_radioButton.add(r640x480);grupo_radioButton.add(r1024x768);
        //AÑADIMOS LOS BOTONES AL JPANEL----------------
        add(r300x200);add(r800x600);
        add(r640x480);add(r1024x768);
        //EVENTOS--------------------
         r300x200.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(300, 200);
            }
        });
         //----------------------------
        r640x480.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(640, 480);
            }
        });
        //--------------------------
        r800x600.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(800, 600);
            }
        });
        //---------------------------
        r1024x768.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(1024, 768);
            }
        });
    }

    public static void main(String[] args) {

        Ventana v = new Ventana();
    }

}

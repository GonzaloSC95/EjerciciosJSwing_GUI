package Ejercicio12;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Ventana extends JFrame {

    private JMenu menu;
    private JMenuBar barraMenu;
    private JMenuItem rojo, verde, azul;

    public Ventana() {
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\espana.png"));
        getContentPane().setBackground(Color.WHITE);
        getContentPane().add(new JPanel(), CENTER_ALIGNMENT);
        initComponetes();
        setVisible(true);
    }

    private void initComponetes() {
        //INSERTAR BARRA DE MENU---------
        barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        //CREAR UNA LISTA MENU Y LA INSERTAMOS EN LA BARRA DEL MENU--------------
        menu = new JMenu("OPCIONES");
        barraMenu.add(menu);
        //------CREAMOS LAS OPCIONES DEL MENU-------------------
        rojo = new JMenuItem("Rojo");
        verde = new JMenuItem("Verde");
        azul = new JMenuItem("Azul");
        //--AÑADIMOS LAS OPCIONES AL MENU------------------
        menu.add(rojo);
        menu.add(verde);
        menu.add(azul);
        //---------------AÑADIMOS ACCIONES AL MENU-------------
        rojo.addActionListener(evento(rojo));
        verde.addActionListener(evento(verde));
        azul.addActionListener(evento(azul));
        //-------------------------------------
        barraMenu.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getContentPane().setBackground(Color.WHITE);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
    public ActionListener evento(JMenuItem m) {
        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (m.equals(rojo)) {
                    getContentPane().setBackground(Color.red);
                } else if (m.equals(verde)) {
                    getContentPane().setBackground(Color.green);
                } else if (m.equals(azul)) {
                    getContentPane().setBackground(Color.blue);
                }
            }
        };
        return evento;
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
    }

}

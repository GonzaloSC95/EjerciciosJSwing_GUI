package Ejercicio13;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Vista extends JFrame {

    private JMenuBar barraMenu;
    private JMenu color, tamanio,opciones;
    private JMenuItem rojo, verde, t400, t600;

    public Vista() {
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(new JPanel(), CENTER_ALIGNMENT);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\DENTALTIX.jpg"));
        getContentPane().setBackground(Color.WHITE);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {

        barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        opciones = new JMenu("Opciones");
        color = new JMenu("Color de fondo");
        tamanio = new JMenu("Tamaño de la ventana");
        barraMenu.add(opciones);
        opciones.add(tamanio);
        opciones.add(color);
        //--------------------------
        rojo=new JMenuItem("Rojo");
        verde=new JMenuItem("Verde");
        t400=new JMenuItem("400x400");
        t600=new JMenuItem("600x600");
        //----------------------------
        color.add(rojo);
        color.add(verde);
        //------------------------
        tamanio.add(t400);
        tamanio.add(t600);
        //---------------
        rojo.addActionListener(new Evento(this));
        verde.addActionListener(new Evento(this));
        t400.addActionListener(new Evento(this));
        t600.addActionListener(new Evento(this));
        barraMenu.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setSize(300, 300);
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

    public JMenuItem getRojo() {
        return rojo;
    }

    public JMenuItem getVerde() {
        return verde;
    }

    public JMenuItem getT400() {
        return t400;
    }

    public JMenuItem getT600() {
        return t600;
    }
    
    

}

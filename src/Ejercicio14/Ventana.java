package Ejercicio14;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {
    
    private JLabel lancho, lalto;
    private JTextField ancho, alto;
    private JMenuBar barraMenu;
    private JMenu menu;
    private JMenuItem cambiarTamanio, salir;
    
    public Ventana() {
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().add(new JPanel(), CENTER_ALIGNMENT);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\presstour.png"));
        initComponents();
        setVisible(true);
    }
    
    private void initComponents() {
        barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        menu = new JMenu("Opciones");
        barraMenu.add(menu);
        //--------------------------
        cambiarTamanio = new JMenuItem("Cambiar tamaño de la ventana");
        salir = new JMenuItem("Salir");
        //---------------------------
        menu.add(cambiarTamanio);
        menu.add(salir);
        //-----------------------
        lancho = new JLabel("Ancho");
        lalto = new JLabel("Alto");
        lalto.setBounds(30, 30, 50, 20);
        lancho.setBounds(30, 70, 50, 20);
        add(lalto);
        add(lancho);
        //----------------------------
        ancho = new JTextField();
        alto = new JTextField();
        alto.setBounds(90, 30, 50, 20);
        ancho.setBounds(90, 70, 50, 20);
        add(alto);
        add(ancho);
        //------------------------------
        cambiarTamanio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (alto.getText().equalsIgnoreCase("") || ancho.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Debes introducir un ancho y una alto, "
                            + "para poder cambiar el tamaño de la Ventana.", null, JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        int anch = Integer.parseInt(ancho.getText());
                        int alt = Integer.parseInt(alto.getText());
                        if (anch < 300 || alt < 200) {
                            JOptionPane.showMessageDialog(null, "El encho de la ventana no puede ser inferior a 300px,\n"
                                    + "ni el alto puede ser inferior 200px.", null, JOptionPane.ERROR_MESSAGE);
                        } else {
                            setSize(anch, alt);
                        }

                        //---------------
                        ancho.setText("");
                        alto.setText("");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Debes introducir un ancho y una alto, en formato número,\n"
                                + "para poder cambiar el tamaño de la Ventana.", null, JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
            }
        });
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        barraMenu.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setSize(300, 200);
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
    
    public static void main(String[] args) {
        
        Ventana v = new Ventana();
    }
    
}

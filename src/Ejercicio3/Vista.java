package Ejercicio3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vista extends JFrame {

    private JTextField num1, num2, resultado;
    private JLabel labelTit, lNum1, lNum2, lresult;
    private JButton btn, reset;

    public Vista() {
        this.setSize(300, 300);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.CYAN);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\espana.png"));
        this.setTitle("CALCULADORA");
        this.initComponets();
        this.IniEventos();
        this.setVisible(true);
    }

    public void initComponets() {
        labelTit = new JLabel(("Introduce los números a sumar").toUpperCase());
        labelTit.setBounds(20, 10, 240, 20);
        labelTit.setAlignmentX(CENTER_ALIGNMENT);
        labelTit.setForeground(Color.WHITE);
        labelTit.setFont(new Font("Arial", Font.BOLD, 13));
        labelTit.setOpaque(true);
        labelTit.setBackground(Color.blue);
        this.add(labelTit);
        //--------------------------------
        lNum1 = new JLabel("Numero 1");
        lNum1.setBounds(20, 60, 80, 20);
        lNum1.setAlignmentX(CENTER_ALIGNMENT);
        this.add(lNum1);
        //--------------------
        num1 = new JTextField();
        num1.setBounds(90, 60, 100, 20);
        num1.setAlignmentX(CENTER_ALIGNMENT);
        this.add(num1);
        //--------------------
        lNum2 = new JLabel("Numero 2");
        lNum2.setBounds(20, 100, 80, 20);
        lNum2.setAlignmentX(CENTER_ALIGNMENT);
        this.add(lNum2);
        //------------------
        num2 = new JTextField();
        num2.setBounds(90, 100, 100, 20);
        num2.setAlignmentX(CENTER_ALIGNMENT);
        this.add(num2);
        //--------------------
        lresult = new JLabel("Resultado");
        lresult.setBounds(20, 160, 80, 20);
        lresult.setAlignmentX(CENTER_ALIGNMENT);
        this.add(lresult);
        //----------------------
        resultado = new JTextField();
        resultado.setBounds(90, 160, 100, 20);
        resultado.setAlignmentX(CENTER_ALIGNMENT);
        resultado.setEditable(false);
        this.add(resultado);
        //-------------------------------------
        btn = new JButton("CALCULAR");
        btn.setBounds(60, 200, 80, 20);
        btn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 8));
        btn.setAlignmentX(CENTER_ALIGNMENT);
        this.add(btn);
        //-------------------------
        reset = new JButton("BORRAR");
        reset.setBounds(150, 200, 80, 20);
        reset.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 8));
        reset.setAlignmentX(CENTER_ALIGNMENT);
        this.add(reset);

    }

    public void IniEventos() {
        btn.addActionListener(new Evento(this));
        reset.addActionListener(new Evento(this));

    }

    //-------GETTERS Y SETTERS-------------
    public JTextField getNum1() {
        return num1;
    }

    public JTextField getNum2() {
        return num2;
    }

    public JTextField getResultado() {
        return resultado;
    }

    public JLabel getLabelTit() {
        return labelTit;
    }

    public JLabel getlNum1() {
        return lNum1;
    }

    public JLabel getlNum2() {
        return lNum2;
    }

    public JLabel getLresult() {
        return lresult;
    }

    public JButton getBtn() {
        return btn;
    }

    public JButton getReset() {
        return reset;
    }

}

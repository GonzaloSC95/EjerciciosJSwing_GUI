package Ejercicio16;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        getContentPane().setBackground(new Color(22, 61, 94, 255));
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\DENTALTIX.jpg"));
        setLocationRelativeTo(null);
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadioButtons = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        lnum1 = new javax.swing.JLabel();
        lnum2 = new javax.swing.JLabel();
        num2 = new javax.swing.JTextField();
        sumar = new javax.swing.JRadioButton();
        num1 = new javax.swing.JTextField();
        restar = new javax.swing.JRadioButton();
        aceptar = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA");
        setPreferredSize(new java.awt.Dimension(300, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 500));
        getContentPane().setLayout(null);

        panel.setBackground(new java.awt.Color(22, 61, 94));
        panel.setAlignmentX(getAlignmentX());
        panel.setAlignmentY(getAlignmentY());
        panel.setMaximumSize(getMaximumSize());
        panel.setMinimumSize(getMinimumSize());
        panel.setPreferredSize(getPreferredSize());

        lnum1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lnum1.setForeground(java.awt.Color.white);
        lnum1.setText("Número 1");

        lnum2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lnum2.setForeground(java.awt.Color.white);
        lnum2.setText("Número 2");

        num2.setBorder(null);

        grupoRadioButtons.add(sumar);
        sumar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        sumar.setForeground(java.awt.Color.white);
        sumar.setText("Sumar");
        sumar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sumar.setOpaque(false);

        num1.setBorder(null);

        grupoRadioButtons.add(restar);
        restar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        restar.setForeground(java.awt.Color.white);
        restar.setText("Restar");
        restar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        restar.setOpaque(false);

        aceptar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        aceptar.setForeground(java.awt.Color.darkGray);
        aceptar.setText("Aceptar");
        aceptar.setBorder(null);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        resultado.setBackground(new java.awt.Color(22, 61, 94));
        resultado.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        resultado.setForeground(java.awt.Color.white);
        resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultado.setBorder(null);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultado)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lnum1)
                                .addGap(37, 37, 37)
                                .addComponent(num1))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lnum2)
                                .addGap(37, 37, 37)
                                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(restar)
                            .addComponent(sumar)
                            .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {restar, sumar});

        panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {num1, num2});

        panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lnum1, lnum2});

        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnum1)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnum2)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(sumar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restar)
                .addGap(33, 33, 33)
                .addComponent(aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {restar, sumar});

        panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {num1, num2});

        panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lnum1, lnum2});

        getContentPane().add(panel);
        panel.setBounds(0, 0, 300, 400);
        panel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        try {
            double result = 0;
            double n1 = Double.parseDouble(num1.getText().replace(",", "."));
            double n2 = Double.parseDouble(num2.getText().replace(",", "."));
            //-----------------------------
            if (sumar.isSelected()) {
                result = n1 + n2;
                resultado.setText("Resultado de " + n1 + " + " + n2 + " = " + result);
            } else if (restar.isSelected()) {
                result = n1 - n2;
                resultado.setText("Resultado de " + n1 + " - " + n2 + " = " + result);
            } else {
                JOptionPane.showMessageDialog(null, "Debes escoger una de las operaciones:\n"
                        + "-Suma.\n"
                        + "-Resta.\n", null, JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes introducir dos números", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarActionPerformed

    public static void main(String args[]) {
        Ventana v = new Ventana();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.ButtonGroup grupoRadioButtons;
    private javax.swing.JLabel lnum1;
    private javax.swing.JLabel lnum2;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton restar;
    private javax.swing.JTextField resultado;
    private javax.swing.JRadioButton sumar;
    // End of variables declaration//GEN-END:variables
}

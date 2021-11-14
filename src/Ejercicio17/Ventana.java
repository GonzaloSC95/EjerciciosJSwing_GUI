package Ejercicio17;

import java.awt.Toolkit;
import java.util.LinkedList;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\personaLog.png"));
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        ingles = new javax.swing.JCheckBox();
        frances = new javax.swing.JCheckBox();
        aleman = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(22, 61, 94));
        panel.setMaximumSize(getMaximumSize());
        panel.setMinimumSize(getMinimumSize());

        ingles.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        ingles.setForeground(java.awt.Color.white);
        ingles.setText("Inglés");
        ingles.setOpaque(false);
        ingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglesActionPerformed(evt);
            }
        });

        frances.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        frances.setForeground(java.awt.Color.white);
        frances.setText("Francés");
        frances.setOpaque(false);
        frances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                francesActionPerformed(evt);
            }
        });

        aleman.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        aleman.setForeground(java.awt.Color.white);
        aleman.setText("Alemán");
        aleman.setOpaque(false);
        aleman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alemanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(frances)
                    .addComponent(ingles, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aleman, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(frances)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(ingles)
                        .addGap(59, 59, 59)
                        .addComponent(aleman)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglesActionPerformed
        if (ingles.isSelected()) {
            idioma.add(ingles.getText());
        } else {
            idioma.remove(ingles.getText());
        }
        String idiomas="";
        for (String x : idioma) {
            idiomas=idiomas+x.toString()+"  ";
        }
        setTitle(idiomas);
    }//GEN-LAST:event_inglesActionPerformed

    private void francesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_francesActionPerformed
        if (frances.isSelected()) {
            idioma.add(frances.getText());
        } else {
            idioma.remove(frances.getText());
        }
        String idiomas="";
        for (String x : idioma) {
            idiomas=idiomas+x.toString()+"  ";
        }
        setTitle(idiomas);
    }//GEN-LAST:event_francesActionPerformed

    private void alemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alemanActionPerformed
       if (aleman.isSelected()) {
            idioma.add(aleman.getText());
        } else {
            idioma.remove(aleman.getText());
        }
         String idiomas="";
        for (String x : idioma) {
            idiomas=idiomas+x.toString()+"  ";
        }
        setTitle(idiomas);
    }//GEN-LAST:event_alemanActionPerformed

    public static void main(String args[]) {
        Ventana v = new Ventana();
    }

    private final LinkedList<String> idioma = new LinkedList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aleman;
    private javax.swing.JCheckBox frances;
    private javax.swing.JCheckBox ingles;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}



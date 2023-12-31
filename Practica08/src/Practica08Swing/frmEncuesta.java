package Practica08Swing;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Cristhian Abel Aguilar Gonzalez -- 20/12/2023 --
 */
public class frmEncuesta extends javax.swing.JFrame {

    /**
     * Creates new form frmEncuesta
     */
    public frmEncuesta() {
        initComponents();
        setTitle("Mini Encuesta 1.0");
        setLocationRelativeTo(null);
        setResizable(false);
        lblHoras.setText(String.valueOf(sdrHoras.getValue()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesSistema = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rboWindows = new javax.swing.JRadioButton();
        rboLinux = new javax.swing.JRadioButton();
        rboMac = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        ckbNetbeans = new javax.swing.JCheckBox();
        ckbEclipse = new javax.swing.JCheckBox();
        ckbjIntellidea = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        sdrHoras = new javax.swing.JSlider();
        lblHoras = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        jmAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elija un - Sistema Operativo -");

        opcionesSistema.add(rboWindows);
        rboWindows.setText("Windows");
        rboWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rboWindowsActionPerformed(evt);
            }
        });

        opcionesSistema.add(rboLinux);
        rboLinux.setText("Linux");

        opcionesSistema.add(rboMac);
        rboMac.setText("MacOs");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione - Herramientas Dev -");

        ckbNetbeans.setText("NetBeans");

        ckbEclipse.setText("Eclipse");

        ckbjIntellidea.setText("jIntellidea");
        ckbjIntellidea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbjIntellideaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Horas dedicadas al Dev");

        sdrHoras.setMaximum(16);
        sdrHoras.setMinimum(1);
        sdrHoras.setValue(8);
        sdrHoras.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sdrHorasStateChanged(evt);
            }
        });

        lblHoras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jmArchivo.setText("Archivo");

        jmSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jmArchivo.add(jmSalir);

        jMenuBar1.add(jmArchivo);

        jmAyuda.setText("Ayuda");

        jmAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmAcerca.setText("Acerca de");
        jmAyuda.add(jmAcerca);

        jMenuBar1.add(jmAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ckbjIntellidea)
                        .addComponent(ckbEclipse)
                        .addComponent(ckbNetbeans)
                        .addComponent(rboMac)
                        .addComponent(rboLinux)
                        .addComponent(rboWindows)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sdrHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rboWindows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rboLinux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rboMac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbNetbeans)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbEclipse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbjIntellidea)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sdrHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rboWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rboWindowsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rboWindowsActionPerformed

    private void ckbjIntellideaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbjIntellideaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbjIntellideaActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String resultado = "Tu -Sistema Operativo- preferido es ->  ";
        JRadioButton[] radios = {rboWindows, rboLinux, rboMac};
        for (int i = 0; i < 3; i++) {
            if (radios[i].isSelected()) {
                resultado = resultado + radios[i].getText();
            }
        }
        resultado = resultado + ", \n Tu -Entorno favorito- es ->  ";

        JCheckBox[] checks = {ckbNetbeans, ckbEclipse, ckbjIntellidea};
        for (int i = 0; i < 3; i++) {
            if (checks[i].isSelected()) {
                resultado = resultado + checks[i].getText() + " ";
            }
        }
        resultado = resultado + ", \n y el número de horas dedicada(s) es ->  " + lblHoras.getText();
        JOptionPane.showMessageDialog(this, resultado);
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void sdrHorasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sdrHorasStateChanged
        lblHoras.setText(String.valueOf(sdrHoras.getValue()));

    }//GEN-LAST:event_sdrHorasStateChanged

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEncuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JCheckBox ckbEclipse;
    private javax.swing.JCheckBox ckbNetbeans;
    private javax.swing.JCheckBox ckbjIntellidea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem jmAcerca;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmAyuda;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JLabel lblHoras;
    private javax.swing.ButtonGroup opcionesSistema;
    private javax.swing.JRadioButton rboLinux;
    private javax.swing.JRadioButton rboMac;
    private javax.swing.JRadioButton rboWindows;
    private javax.swing.JSlider sdrHoras;
    // End of variables declaration//GEN-END:variables
}
